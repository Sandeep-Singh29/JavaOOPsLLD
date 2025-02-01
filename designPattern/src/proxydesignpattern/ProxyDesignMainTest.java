package proxydesignpattern;

/**
 * Author: Sandeep Singh
 * Date: 01/02/25
 */

public class ProxyDesignMainTest {

    public static void main(String[] args) {

        try {
            EmployeeDAO emp = new EmployeeDAOProxy();
            emp.create("ADMIN", new Employee());
            System.out.println("Operation Successfully..!!!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
