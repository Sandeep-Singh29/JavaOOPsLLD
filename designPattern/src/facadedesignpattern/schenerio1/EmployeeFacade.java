package facadedesignpattern.schenerio1;

/**
 * Author: Sandeep Singh
 * Date: 05/02/25
 */

public class EmployeeFacade {

    private EmployeeDAO employeeDAO;

    public EmployeeFacade() {
        employeeDAO = new EmployeeDAO();
    }

    public void insert() {
        employeeDAO.insert();
    }

    public Employee getEmployeeById(int empId) {
        System.out.println("Employee Get By ID  : " + empId);
        return employeeDAO.getEmployeeById(empId);
    }


}
