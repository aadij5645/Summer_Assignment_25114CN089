import java.util.Scanner;
public class StudentRecordSystem 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];
        int[] rollNo = new int[10];
        int count = 0;
        int choice;
        do {
            System.out.println("\n--- Student Record System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) 
            {
                case 1:
                    if (count < 10) 
                    {
                        System.out.print("Enter Roll Number: ");
                        rollNo[count] = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Student Name: ");
                        names[count] = sc.nextLine();
                        count++;
                        System.out.println("Student record added successfully.");
                    } 
                    else 
                    {
                        System.out.println("Record is full.");
                    }
                    break;
                case 2:
                    if (count == 0) 
                    {
                        System.out.println("No student records available.");
                    } 
                    else 
                    {
                        System.out.println("\nStudent Records:");
                        for (int i = 0; i < count; i++) 
                        {
                            System.out.println("Roll No: " + rollNo[i] + "  Name: " + names[i]);
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