package solidprinciples.singleresponsibility;

public class InvoiceDAO {

    private Invoice invoice;

    public InvoiceDAO(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveDB() {
        // Save Code write here
        System.out.println("Print in InvoiceDAO : " + invoice.hashCode());
    }

}
