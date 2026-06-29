import java.util.Scanner;
public class ContactManagementSystem 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];
        String[] numbers = new String[10];
        int count = 0;
        int choice;
        do {
            System.out.println("\n--- Contact Management System ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) 
            {
                case 1:
                    if (count < 10) 
                    {
                        System.out.print("Enter Name: ");
                        names[count] = sc.nextLine();
                        System.out.print("Enter Phone Number: ");
                        numbers[count] = sc.nextLine();
                        count++;
                        System.out.println("Contact added successfully.");
                    } 
                    else 
                    {
                        System.out.println("Contact list is full.");
                    }
                    break;
                case 2:
                    if (count == 0)
                    {
                        System.out.println("No contacts available.");
                    } 
                    else 
                    {
                        System.out.println("Contact List:");
                        for (int i = 0; i < count; i++) {
                            System.out.println(names[i] + " - " + numbers[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);
    }
}