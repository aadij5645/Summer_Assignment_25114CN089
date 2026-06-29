import java.util.Scanner;
public class MiniProject 
{

    static int[] roll = new int[10];
    static String[] name = new String[10];
    static int count = 0;
    static Scanner sc = new Scanner(System.in);
    static void addStudent() 
    {
        if (count < 10) 
        {
            System.out.print("Enter Roll Number: ");
            roll[count] = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            name[count] = sc.nextLine();
            count++;
            System.out.println("Student added successfully.");
        } 
        else 
        {
            System.out.println("Record is full.");
        }
    }
    static void displayStudents()
    {
        if (count == 0) 
        {
            System.out.println("No student records found.");
        } 
        else 
        {
            System.out.println("\nStudent Records:");
            for (int i = 0; i < count; i++) 
            {
                System.out.println("Roll No: " + roll[i] + "  Name: " + name[i]);
            }
        }
    }
    static void searchStudent() 
    {
        System.out.print("Enter Roll Number to search: ");
        int r = sc.nextInt();
        for (int i = 0; i < count; i++) 
        {
            if (roll[i] == r) 
            {
                System.out.println("Student Found");
                System.out.println("Roll No: " + roll[i]);
                System.out.println("Name: " + name[i]);
                return;
            }
        }
        System.out.println("Student not found.");
    }
    public static void main(String[] args) 
    {
        int choice;
        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }
}