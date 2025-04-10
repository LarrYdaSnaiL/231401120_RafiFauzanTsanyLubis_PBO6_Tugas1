public class Main {
    public static void main(String[] args) {
        // Creating objects for each case study
        Payment sitiPayment = new Payment(3500000, "Kartu Kredit");
        Payment ciciripiPayment = new Payment(10000000, "Voucher 15%");
        Payment asnawiPayment = new Payment(1200000, "Transfer Bank");

        // Case Study 1: Siti
        System.out.println("Case Study 1: Siti");
        System.out.println("Total Harga Sebelum Diskon: Rp " + sitiPayment.formatPrice(sitiPayment.totalPrice));
        sitiPayment.displayPaymentDetails("Pembayaran Berhasil dengan Kartu Kredit", "Kartu Kredit");
        System.out.println("Total Harga Setelah Diskon: Rp " + sitiPayment.formatPrice(sitiPayment.getTotalPriceAfterDiscount()));

        System.out.println("\n");

        // Case Study 2: Ciciripi
        System.out.println("Case Study 2: Ciciripi");
        System.out.println("Total Harga Sebelum Diskon: Rp " + ciciripiPayment.formatPrice(ciciripiPayment.totalPrice));
        ciciripiPayment.displayPaymentDetails("Pembayaran Berhasil dengan Voucher Diskon", "Voucher 15%");
        System.out.println("Total Harga Setelah Diskon: Rp " + ciciripiPayment.formatPrice(ciciripiPayment.getTotalPriceAfterDiscount()));

        System.out.println("\n");

        // Case Study 3: Asnawi
        System.out.println("Case Study 3: Asnawi");
        System.out.println("Total Harga Sebelum Diskon: Rp " + asnawiPayment.formatPrice(asnawiPayment.totalPrice));
        asnawiPayment.displayPaymentDetails("Pembayaran Berhasil dengan Transfer Bank", "Transfer Bank");
        System.out.println("Total Harga Setelah Diskon: Rp " + asnawiPayment.formatPrice(asnawiPayment.getTotalPriceAfterDiscount()));
    }
}