import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of new members: ");
        int members = input.nextInt();

        if (members < 0) {
            System.out.println("Invalid number. Number of members must be 0 or greater.");
            return;
        }

        switch (members) {
            case 0:
                System.out.println("Prize: No Prize");
                break;

            case 1:
                System.out.println("Prize: Pen");
                break;

            case 2:
                System.out.println("Prize: Umbrella");
                break;

            case 3:
                System.out.println("Prize: Bag");
                break;

            case 4:
                System.out.println("Prize: Travelling Chair");
                break;

            default:
                System.out.println("Prize: Headphone");
                break;
        }
    }
}
