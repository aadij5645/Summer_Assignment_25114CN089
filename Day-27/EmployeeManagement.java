import java.util.Scanner;
class Employee
{
    int id;
    String name;
    double salary;
}
public class EmployeeManagement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Employee emp[] = new Employee[100];
        int count = 0;
        int choice;
        do
        {
            System.out.println("\n----- Employee Management System -----");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    emp[count] = new Employee();
                    System.out.print("Enter Employee ID: ");
                    emp[count].id = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Employee Name: ");
                    emp[count].name = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    emp[count].salary = sc.nextDouble();
                    count++;
                    System.out.println("Employee Added Successfully!");
                    break;
                case 2:
                    if(count == 0)
                    {
                        System.out.println("No Employee Records Found!");
                    }
                    else
                    {
                        System.out.println("\nEmployee Records:");
                        for(int i = 0; i < count; i++)
                        {
                            System.out.println("ID     : " + emp[i].id);
                            System.out.println("Name   : " + emp[i].name);
                            System.out.println("Salary : " + emp[i].salary);
                            System.out.println("---------------------------");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Employee ID to Search: ");
                    int id = sc.nextInt();
                    boolean found = false;
                    for(int i = 0; i < count; i++)
                    {
                        if(emp[i].id == id)
                        {
                            System.out.println("Employee Found!");
                            System.out.println("ID     : " + emp[i].id);
                            System.out.println("Name   : " + emp[i].name);
                            System.out.println("Salary : " + emp[i].salary);
                            found = true;
                            break;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Employee Not Found!");
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