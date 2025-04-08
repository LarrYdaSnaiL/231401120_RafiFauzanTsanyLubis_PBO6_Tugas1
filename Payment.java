public class Payment {
    double totalPrice;
    String paymentMethod;
    String paymentStatus;

    public Payment(double totalPrice, String paymentMethod) {
        this.totalPrice = totalPrice;
        this.paymentMethod = paymentMethod;
    }

    public void displayPaymentDetails(String paymentStatus, String paymentMethod) {
        this.paymentStatus = paymentStatus;
        System.out.println("Metode Pembayaran: " + paymentMethod);
        System.out.println("Status Pembayaran: " + paymentStatus);
    }

    public double getTotalPriceAfterDiscount() {
        if (paymentMethod.equalsIgnoreCase("Voucher")) {
            return totalPrice * 0.85; // 15% discount for voucher
        } else {
            return totalPrice;
        }
    }
}
