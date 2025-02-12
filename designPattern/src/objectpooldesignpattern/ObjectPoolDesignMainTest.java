package objectpooldesignpattern;

/**
 * Author: Sandeep Singh
 * Date: 11/02/25
 */

public class ObjectPoolDesignMainTest {
    public static void main(String[] args) {

        DBConnectionPoolManager poolManager = DBConnectionPoolManager.getInstance();
        DBConnection dbConnection1 = poolManager.getDBConnection();
        DBConnection dbConnection2 = poolManager.getDBConnection();
        DBConnection dbConnection3 = poolManager.getDBConnection();
        DBConnection dbConnection4 = poolManager.getDBConnection();
        DBConnection dbConnection5 = poolManager.getDBConnection();
        DBConnection dbConnection6 = poolManager.getDBConnection();
        poolManager.getDBConnection();
        poolManager.releaseDBConnection(dbConnection6);

    }
}
