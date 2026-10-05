import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Constants
        final int MIN_DAY = 1;
        final int MAX_DAY = 31;
        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        // Input dates
        System.out.print("Enter start date: ");
        int startDay = input.nextInt();

        System.out.print("Enter end date: ");
        int endDay = input.nextInt();

        // Validation 1
        if (startDay < MIN_DAY || startDay > MAX_DAY ||
            endDay < MIN_DAY || endDay > MAX_DAY) {

            System.out.println("Error: Start date and end date must be between 1 and 31.");
            return;
        }

        // Validation 2
        if (startDay >= endDay) {
            System.out.println("Error: Start date should be less than the end date.");
            return;
        }

        // Calculate number of days
        int daysReserved = endDay - startDay;

        // Calculate total room charge
        double totalAmount = daysReserved * ROOM_CHARGE;
        double discount = 0;

        // Calculate discount
        if (daysReserved >= 3 && daysReserved <= 4) {
            discount = totalAmount * DISCOUNT_10;
        } else if (daysReserved >= 5) {
            discount = totalAmount * DISCOUNT_20;
        }

        double amountToPay = totalAmount - discount;

        // Display results
        System.out.println("Number of days reserved = " + daysReserved);
        System.out.printf("Room charge = Rs. %.2f%n", totalAmount);
        System.out.printf("Discount = Rs. %.2f%n", discount);
        System.out.printf("Total amount to pay = Rs. %.2f%n", amountToPay);
    }
}
