package immutableClass;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 01/02/25
 */

final class MyImmutable {

    private final String name;
    private final String address;
    private final List<Object> carName;

    public MyImmutable(String name, String address, List<Object> carName) {
        this.name = name;
        this.address = address;
        //this.carName = new ArrayList<>(carName); // In this time we have Change in List Object
        this.carName = carName;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<Object> getCarName() {
        return new ArrayList<>(carName);
    }

    @Override
    public String toString() {
        return "MyImmutable{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", carName=" + carName +
                '}';
    }
}
