import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // greeting
        System.out.println("Welcome to Morsalin's Tip Calculator!");
        System.out.print("How many people are in your group: ");
        int group = scan.nextInt();
        scan.nextLine(); // extra line so code runs as intended

        System.out.print("What's the tip percentage? (0-100): ");
        int tip = scan.nextInt();
        scan.nextLine(); // extra line so code runs as intended ]

        TipCalculator calc = new TipCalculator(group, tip);

        double cost = 0.0;
        // this loop asks the user for their meal prices
        // runs till user inputs -1
        while (cost != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextDouble();
            scan.nextLine();

            if (cost != -1) {
                calc.addMeal(cost);
            }
        }
        // Calculations
        System.out.println("-------------------------------------------");
        System.out.println("Total bill before tip: $" + calc.getTotalBillBeforeTip());
        System.out.println("Total percentage: " + tip + "%");
        System.out.println("Total tip: $" + calc.tipAmount());
        System.out.println("Total bill with tip: $" + calc.totalBill());
        System.out.println("Per person cost before tip: $" + calc.perPersonCostBeforeTip());
        System.out.println("Tip per person: $" + calc.perPersonTipAmount());
        System.out.println("Total cost per person: $" + calc.perPersonTotalCost());
        System.out.println("-------------------------------------------");

        scan.close();
    }
}
