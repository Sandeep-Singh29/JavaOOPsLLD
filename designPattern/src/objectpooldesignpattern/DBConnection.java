package objectpooldesignpattern;

import java.sql.Connection;

/**
 * Author: Sandeep Singh
 * Date: 11/02/25
 */

public class DBConnection {

    private static int count = 1;
    Connection mySqlConnection;

    DBConnection() {
        String username = "Sandeep";
        String password = "12345";
        String url = "jdbc.mysql";
        System.out.print("Connection Is Stabilized : " + count++ + "\n");
        System.out.println("username : " + username + " , password : " + password + " , url : " + url);
    }

}
