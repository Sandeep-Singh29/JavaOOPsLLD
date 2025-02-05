package facadedesignpattern.paymentsystemschenerio2.facade;

import facadedesignpattern.paymentsystemschenerio2.productdetails.*;

/**
 * Author: Sandeep Singh
 * Date: 05/02/25
 */

public class OrderFacade {

    private final Notification notification;
    private final Invoice invoice;
    private final Payment payment;
    private final ProductDAO productDAO;

    public OrderFacade() {
        this.notification = new Notification();
        this.invoice = new Invoice();
        this.payment = new Payment();
        this.productDAO = new ProductDAO();
    }

    public void createOrder() {
        Product productById = productDAO.getProductById(11); // step 1
        System.out.println(productById);
        payment.checkPayment(); // step 2
        invoice.generateInvoice(); // step 3
        notification.sendNotification(); // step 4


    }


}
