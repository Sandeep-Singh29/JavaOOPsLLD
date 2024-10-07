package constructor;

/**
 * Author: SANDEEP
 * Date: 07/10/24
 */

public class UseAccount {

    public static void main(String[] args) {
/*
        agar hum koi constructor nahi banata hai to JVM run time
        main default constucter create karta hai and
        consttuctor ka use sa Object create karta hai
*/

        // Agar hum koi value intilized nahi karat hai ti JVm kar Datatype ka default value deta hai
        Account acc1 = new Account();  //Create a Object Using Default ur Without paramter Constuctor
        acc1.showAccount();

        // Data Initilized Using Paramter Costuctor

        Account acc2 = new Account(10, "sandeep", 600000);
        acc2.showAccount();

    }

}
