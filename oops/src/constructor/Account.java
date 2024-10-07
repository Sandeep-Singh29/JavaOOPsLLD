package constructor;

/**
 * Author: SANDEEP
 * Date: 07/10/24
 */

public class Account {

    private int id;
    private String name;
    private int balance;

    public Account(int i, String n, int b) {
        System.out.println("Data Initilized USing Parameter Constructor");
        id = i;
        name = n;
        balance = b;
    }

    public Account() {
        System.out.println("Constructor Called First Using Default Constuctor");
    }


    public void showAccount() {
        System.out.println("id is : " + id);
        System.out.println("name is : " + name);
        System.out.println("balance is : " + balance);
    }

}
