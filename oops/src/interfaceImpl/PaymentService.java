package interfaceImpl;

@FunctionalInterface
public interface PaymentService {

    void paymentMethod();

    default void paymentProcess(String paymentType) {
        System.out.println("Payment Process Done By" + paymentType);
    }

    static void appName() {
        System.out.println("Phone Pay APP..!!");
    }

    static void appName1() {
        System.out.println("Navi APP..!!");
    }
}
