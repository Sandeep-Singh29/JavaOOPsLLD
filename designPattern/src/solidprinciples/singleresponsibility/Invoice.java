package solidprinciples.singleresponsibility;

public class Invoice {

    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal() {
        // If in future is only One reason to change a Class than we Modify
        // ** suppose in some time there are OFFER or GST related thing then we have changed the code
        int price = ((marker.price)) * this.quantity;
        return price;
    }
}
