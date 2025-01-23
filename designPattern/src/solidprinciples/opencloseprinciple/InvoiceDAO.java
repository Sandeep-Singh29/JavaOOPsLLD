package solidprinciples.opencloseprinciple;

import solidprinciples.singleresponsibility.Invoice;

public interface InvoiceDAO {

    public void save(Invoice invoice);

}
