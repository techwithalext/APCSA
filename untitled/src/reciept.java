public class reciept {
    public static void main(String[] args) {
        // Calculate total owed, assuming 8% tax / 15% tip
        double subtotal = (38 + 40 + 30);
        System.out.println("Subtotal: " + subtotal);

        double tax = ((38 + 40 + 30) * .08);
        System.out.println("Tax: " + tax);

        double tip = ((38 + 40 + 30) * .15);
        System.out.println("Tip: " + tip);

        double total = (38 + 40 + 30 +
                (38 + 40 + 30) * .15 +
                (38 + 40 + 30) * .08);
        System.out.println("Total: " + total);



    }
}
