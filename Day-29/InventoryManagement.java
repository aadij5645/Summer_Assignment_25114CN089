import java.util.Scanner;
public class InventoryManagement 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String[] items = new String[10];
        int[] quantity = new int[10];
        int count = 0;
        int choice;
        do {
            System.out.println("\n--- Inventory Management System ---");
            System.out.println("1. Add Item");
            System.out.println("2. Display Items");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) 
            {
                case 1:
                    if (count < 10) 
                    {
                        System.out.print("Enter item name: ");
                        items[count] = sc.nextLine();
                        System.out.print("Enter quantity: ");
                        quantity[count] = sc.nextInt();
                        count++;
                        System.out.println("Item added successfully.");
                    } 
                    else 
                    {
                        System.out.println("Inventory is full.");
                    }
                    break;
                case 2:
                    if (count == 0) 
                    {
                        System.out.println("No items available.");
                    } 
                    else 
                    {
                        System.out.println("Inventory List:");
                        for (int i = 0; i < count; i++) 
                        {
                            System.out.println(items[i] + " - Quantity: " + quantity[i]);
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