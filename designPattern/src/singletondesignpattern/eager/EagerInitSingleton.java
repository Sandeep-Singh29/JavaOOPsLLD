package singletondesignpattern.eager;

/**
 * Author: Sandeep Singh
 * Date: 01/02/25
 */

public class EagerInitSingleton {
    public static void main(String[] args) {
        DbConnection instance = DbConnection.getInstance();
        System.out.println(instance.hashCode());
        DbConnection instance1 = DbConnection.getInstance();
        System.out.println(instance1.hashCode());
    }
}

class DbConnection{
    public static DbConnection dbConnection = new DbConnection();

    private DbConnection(){
    }

    public static DbConnection getInstance(){
        System.out.println("DBConnection Created");
        return dbConnection;
    }


}
