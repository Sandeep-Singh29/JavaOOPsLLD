package facadedesignpattern.schenerio1;

/**
 * Author: Sandeep Singh
 * Date: 05/02/25
 */

public class EmployeeClient {

    public static void getEmployeeDetails(){
        EmployeeFacade employeeFacade = new EmployeeFacade();
        Employee employeeById = employeeFacade.getEmployeeById(121);
        System.out.println(employeeById);
    }

}
