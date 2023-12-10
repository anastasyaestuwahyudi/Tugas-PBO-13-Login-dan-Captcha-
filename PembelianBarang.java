public class PembelianBarang extends Pembelian implements TotalPayment {

    public PembelianBarang(String invoiceNumber, String productCode, String customerName, String customerAddress,
            String numberPhone,
            String productName, double productPrice, int quantity, String cashierName) {
        super(invoiceNumber, productCode, customerName, customerAddress, numberPhone, productName, productPrice,
                quantity, cashierName);
    }

    @Override
    public double calculateTotalPrice() {
        return productPrice * quantity;

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Total Payment: Rp" + calculateTotalPrice());
    }
}
