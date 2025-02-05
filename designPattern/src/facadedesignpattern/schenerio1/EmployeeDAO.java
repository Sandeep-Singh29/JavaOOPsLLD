package facadedesignpattern.schenerio1;

/**
 * Author: Sandeep Singh
 * Date: 05/02/25
 */

public class EmployeeDAO {


    public void insert() {
        System.out.println("Employee insert in DB");
    }

    public void updateEmployee() {
        System.out.println("Employee updated Successfully..!!!");
    }

    public Employee getEmployeeByEmail(String email) {
        return new Employee();
    }

    public Employee getEmployeeById(int empId) {
        return new Employee();
    }

}
