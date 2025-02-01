package proxydesignpattern;

/**
 * Author: Sandeep Singh
 * Date: 01/02/25
 */

public class EmployeeDAOProxy implements EmployeeDAO {

    EmployeeDAO employeeDAO;

    public EmployeeDAOProxy() {
        employeeDAO = new EmployeeDAOImpl();
    }

    @Override
    public void create(String client, Employee emp) throws Exception {
        if (client.equals("ADMIN")) {
            employeeDAO.create(client, emp);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int empID) throws Exception {
        if (client.equals("ADMIN")) {
            employeeDAO.delete(client, empID);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public Employee get(String client, int empID) throws Exception {
        if (client.equals("ADMIN") || client.equals("USER")) {
            return employeeDAO.get(client, empID);
        }
        throw new Exception("Access Denied");
    }
}
