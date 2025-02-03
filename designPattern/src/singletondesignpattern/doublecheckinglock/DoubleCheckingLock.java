package singletondesignpattern.doublecheckinglock;

/**
 * Author: Sandeep Singh
 * Date: 01/02/25
 */

public class DoubleCheckingLock {

    public static void main(String[] args) {
        DBConnection dbConnection =  DBConnection.getInstance();
        System.out.println(dbConnection.hashCode());

    }

}

class DBConnection {

    private static volatile DBConnection dbConnection;

    private DBConnection() {
    }

    public static DBConnection getInstance() {

        if (dbConnection == null) {
            synchronized (DBConnection.class) {
                if (dbConnection == null) {
                    dbConnection = new DBConnection();
                }
            }
        }
        return dbConnection;
    }

}
