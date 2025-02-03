package prototypedesignpattern;

/**
 * Author: Sandeep Singh
 * Date: 01/02/25
 */

public class PrototypeDesign {

    public static void main(String[] args) {
        DBConnection instance = DBConnection.getInstance();
        System.out.println(instance.hashCode());
        DBConnection instance2 = DBConnection.getInstance();
        System.out.println(instance2.hashCode());
        DBConnection instance3 = DBConnection.getInstance();
        System.out.println(instance3.hashCode());
    }
}

class DBConnection {

    private static DBConnection dbConnection;

    private DBConnection() {
    }

    public static DBConnection getInstance() {
        if (dbConnection == null) {
            return dbConnection = new DBConnection();
        }
        return dbConnection = new DBConnection();
    }

}
