import java.util.Scanner;

public class IT24102281Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double DISCOUNT_RATE = 0.05; 
        int customers = 5;

        for (int i = 1; i <= customers; i++) {
            System.out.println("Customer " + i);
            
            
            System.out.print("Enter total bill amount: ");
            double billAmount = scanner.nextDouble();
            
            
            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char paymentMode = scanner.next().charAt(0);
            
            
            if (paymentMode == 'C' || paymentMode == 'c') {
                double discount = billAmount * DISCOUNT_RATE;
                double finalAmount = billAmount - discount;
                System.out.printf("Discount: %.2f%n", discount);
                System.out.printf("Amount to be paid: %.2f%n", finalAmount);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                System.out.printf("No discount applied.%nAmount to be paid: %.2f%n", billAmount);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }
            System.out.println(); 
        }
        
        
    }
}