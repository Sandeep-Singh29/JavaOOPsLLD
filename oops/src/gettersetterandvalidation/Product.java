package gettersetterandvalidation;

/**
 * Author: SANDEEP
 * Date: 07/10/24
 */

public class Product {

    private int id;
    private String pName;
    private int price;

    public void setId(int id) {
        this.id = id;
    }

    public void setpName(String pName) {
        if(pName.length()<5){
            System.out.println("pName Length is Less Than 5 Plese Set again");
            return;
        }
        this.pName = pName;
    }

    public void setPrice(int price) {
        if(price<50000){
            System.out.println("Price not less than 50000");
            return;
        }
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getpName() {
        return pName;
    }

    public int getPrice() {
        return price;
    }

    public void showProductDetails() {
        System.out.println("Id is : " + id);
        System.out.println("pName is : " + pName);
        System.out.println("Price is : " + price);
    }


}

