package singletondesignpattern.synchronization;

/**
 * Author: Sandeep Singh
 * Date: 01/02/25
 */

public class SynchronizationSingleton {
    public static void main(String[] args) {
        DBConnection instance = DBConnection.getInstance();
        System.out.println(instance.hashCode());
        DBConnection instance1 = DBConnection.getInstance();
        System.out.println(instance1.hashCode());
    }
}

class DBConnection {

    private static DBConnection dbConnection;

    private DBConnection() {
    }

    synchronized public static DBConnection getInstance() {
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }

}
