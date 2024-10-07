package gettersetterandvalidation;

/**
 * Author: SANDEEP
 * Date: 07/10/24
 */

public class UseProduct {

    public static void main(String[] args) {
        Product p = new Product();
        p.showProductDetails(); // without set the data

        //Set data of product
        //"Set the Product Details Using setter() Method"
        Product p2 = new Product();
        System.out.println();
        p2.setId(10);
        p2.setpName("samsung S24");
        p2.setPrice(100000);

        System.out.println("Get All Product Details Using getter() Method");
        System.out.println("Id is : " + p2.getId());
        System.out.println("pName is : " + p2.getpName());
        System.out.println("Price is : " + p2.getPrice());


        // if Price and Name is not valid then used is not Set the data
        Product p3 = new Product();
        p3.setId(20);
        p3.setpName("samsung S24");
        p3.setPrice(100000);
        System.out.println("Get All Product Details Using getter() Method");
        System.out.println("Id is : " + p3.getId());
        System.out.println("pName is : " + p3.getpName());
        System.out.println("Price is : " + p3.getPrice());

    }

}
