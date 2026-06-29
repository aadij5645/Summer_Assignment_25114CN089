import java.util.Scanner;
public class MiniEmployeeManagement 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] empId = new int[10];
        String[] empName = new String[10];
        int count = 0;
        int choice;
        do {
            System.out.println("\n--- Mini Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) 
            {
                case 1:
                    if (count < 10) 
                    {
                        System.out.print("Enter Employee ID: ");
                        empId[count] = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Employee Name: ");
                        empName[count] = sc.nextLine();
                        count++;
                        System.out.println("Employee added successfully.");
                    } 
                    else 
                    {
                        System.out.println("Employee list is full.");
                    }
                    break;
                case 2:
                    if (count == 0) 
                    {
                        System.out.println("No employee records available.");
                    } 
                    else 
                    {
                        System.out.println("\nEmployee Records:");
                        for (int i = 0; i < count; i++) 
                        {
                            System.out.println("ID: " + empId[i] + "  Name: " + empName[i]);
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