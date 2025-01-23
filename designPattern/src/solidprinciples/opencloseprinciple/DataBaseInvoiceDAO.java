package solidprinciples.opencloseprinciple;

import solidprinciples.singleresponsibility.Invoice;

public class DataBaseInvoiceDAO implements InvoiceDAO {


    @Override
    public void save(Invoice invoice) {
        System.out.println("Save Invoice In DataBaseInvoiceDAO");
    }
}
