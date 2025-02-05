package facadedesignpattern.paymentsystemschenerio2.productdetails;

/**
 * Author: Sandeep Singh
 * Date: 05/02/25
 */

public class ProductDAO {

    public Product getProductById(int pId) {
        System.out.println("Product get By Id : " + pId);
        return new Product();
    }

}
