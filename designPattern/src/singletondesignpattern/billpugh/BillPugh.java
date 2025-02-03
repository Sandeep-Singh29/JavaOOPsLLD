package singletondesignpattern.billpugh;

/**
 * Author: Sandeep Singh
 * Date: 01/02/25
 */

public class BillPugh {
    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getInstance();
        System.out.println(dbConnection.hashCode());
    }
}

class DBConnection {

    private DBConnection() {
    }

    private static class DBConnectionHelper {
        private static final DBConnection INSTANCE_OBJECT = new DBConnection();
    }

    public static DBConnection getInstance() {
        return DBConnectionHelper.INSTANCE_OBJECT;
    }

}
