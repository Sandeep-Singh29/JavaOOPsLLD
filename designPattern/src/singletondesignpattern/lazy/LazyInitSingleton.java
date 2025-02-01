package singletondesignpattern.lazy;

/**
 * Author: Sandeep Singh
 * Date: 01/02/25
 */

public class LazyInitSingleton {
    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getInstance();
        System.out.println(dbConnection.hashCode());
        DBConnection dbConnection1 = DBConnection.getInstance();
        System.out.println(dbConnection1.hashCode());

    }
}

class DBConnection {

    private static DBConnection lazySingleton;

    private DBConnection() {
    }

    public static DBConnection getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new DBConnection();
        }
        return lazySingleton;
    }
}
