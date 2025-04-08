import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public String formatPrice(double price) {
        DecimalFormat df = new DecimalFormat("###,###,###");
        return df.format(price);
    }

    public double getTotalPriceAfterDiscount() {
        if (paymentMethod.toLowerCase().contains("voucher")) {
            double discountPercentage = extractDiscountPercentage(paymentMethod.toLowerCase());

            if (discountPercentage > 0) {
                return totalPrice * (1 - discountPercentage / 100);
            } else {
                return totalPrice - 1;
            }
        } else {
            return totalPrice;
        }
    }

    public static double extractDiscountPercentage(String input) {
        String regex = "(\\d+)%";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            String found = matcher.group(1);
            return Double.parseDouble(found);
        } else {
            System.out.println("No match found");
        }

        return 0;
    }
}