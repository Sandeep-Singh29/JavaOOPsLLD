package solidprinciples.opencloseprinciple;

import solidprinciples.singleresponsibility.Invoice;

public class FileInvoiceDAO implements InvoiceDAO {

    @Override
    public void save(Invoice invoice) {
        System.out.println("Save Invoice in FileInvoiceDAO");
    }
}
