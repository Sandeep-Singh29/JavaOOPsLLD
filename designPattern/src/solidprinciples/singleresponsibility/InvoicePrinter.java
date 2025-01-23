package solidprinciples.singleresponsibility;

public class InvoicePrinter {

    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void invoicePrinter() {
        // Print code write here
        System.out.println("Print in InvoicePrinter : " + invoice.hashCode());
    }

}
