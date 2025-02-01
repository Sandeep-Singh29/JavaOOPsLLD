package proxydesignpattern;

/**
 * Author: Sandeep Singh
 * Date: 01/02/25
 */

public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public void create(String client, Employee emp) throws Exception {
        System.out.println("Create a Employee in employee Table");
    }

    @Override
    public void delete(String client, int empID) throws Exception {
        System.out.println("Delete Employee Record With Id: " + empID);
    }

    @Override
    public Employee get(String client, int empID) throws Exception {
        System.out.println("Fetching Date From employee Table");
        return new Employee();
    }
}
