import java.util.Scanner;
class Student
{
    int rollNo;
    String name;
    int marks;
}
public class StudentRecord
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Student students[] = new Student[100];
        int count = 0;
        int choice;
        do
        {
            System.out.println("\n----- Student Record Management System -----");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    students[count] = new Student();
                    System.out.print("Enter Roll Number: ");
                    students[count].rollNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    students[count].name = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    students[count].marks = sc.nextInt();
                    count++;
                    System.out.println("Student Record Added Successfully!");
                    break;
                case 2:
                    if(count == 0)
                    {
                        System.out.println("No Records Found!");
                    }
                    else
                    {
                        System.out.println("\nStudent Records:");
                        for(int i = 0; i < count; i++)
                        {
                            System.out.println("Roll No : " + students[i].rollNo);
                            System.out.println("Name    : " + students[i].name);
                            System.out.println("Marks   : " + students[i].marks);
                            System.out.println("-------------------------");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    int roll = sc.nextInt();
                    boolean found = false;
                    for(int i = 0; i < count; i++)
                    {
                        if(students[i].rollNo == roll)
                        {
                            System.out.println("Student Found!");
                            System.out.println("Roll No : " + students[i].rollNo);
                            System.out.println("Name    : " + students[i].name);
                            System.out.println("Marks   : " + students[i].marks);
                            found = true;
                            break;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Student Not Found!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        } while(choice != 4);
    }
}