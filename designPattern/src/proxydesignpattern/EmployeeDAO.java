package proxydesignpattern;

/**
 * Author: Sandeep Singh
 * Date: 01/02/25
 */

public interface EmployeeDAO {

    void create(String client, Employee emp) throws Exception;

    void delete(String client, int empID) throws Exception;

    Employee get(String client, int empID) throws Exception;

}
