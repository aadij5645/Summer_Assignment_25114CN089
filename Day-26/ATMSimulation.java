import java.util.Scanner;
public class ATMSimulation 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double balance = 1000;
        int choice;
        double amount;
        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Balance: ₹" + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextDouble();
                    balance += amount;
                    System.out.println("Amount deposited successfully.");
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextDouble();
                    if (amount <= balance) 
                    {
                        balance -= amount;
                        System.out.println("Please collect your cash.");
                    } 
                    else 
                    {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }
}