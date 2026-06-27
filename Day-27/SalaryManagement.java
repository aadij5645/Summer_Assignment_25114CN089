import java.util.Scanner;
class Salary
{
    int empId;
    String name;
    double basicSalary;
    double bonus;
    double totalSalary;
}
public class SalaryManagement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Salary emp[] = new Salary[100];
        int count = 0;
        int choice;
        do
        {
            System.out.println("\n----- Salary Management System -----");
            System.out.println("1. Add Salary Record");
            System.out.println("2. Display Salary Records");
            System.out.println("3. Search Salary Record");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    emp[count] = new Salary();
                    System.out.print("Enter Employee ID: ");
                    emp[count].empId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    emp[count].name = sc.nextLine();
                    System.out.print("Enter Basic Salary: ");
                    emp[count].basicSalary = sc.nextDouble();
                    System.out.print("Enter Bonus: ");
                    emp[count].bonus = sc.nextDouble();
                    emp[count].totalSalary = emp[count].basicSalary + emp[count].bonus;
                    count++;
                    System.out.println("Salary Record Added Successfully!");
                    break;
                case 2:
                    if(count == 0)
                    {
                        System.out.println("No Salary Records Found!");
                    }
                    else
                    {
                        System.out.println("\nSalary Records:");
                        for(int i = 0; i < count; i++)
                        {
                            System.out.println("Employee ID : " + emp[i].empId);
                            System.out.println("Name        : " + emp[i].name);
                            System.out.println("Basic Salary: " + emp[i].basicSalary);
                            System.out.println("Bonus       : " + emp[i].bonus);
                            System.out.println("Total Salary: " + emp[i].totalSalary);
                            System.out.println("-----------------------------");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Employee ID to Search: ");
                    int id = sc.nextInt();
                    boolean found = false;
                    for(int i = 0; i < count; i++)
                    {
                        if(emp[i].empId == id)
                        {
                            System.out.println("Salary Record Found!");
                            System.out.println("Employee ID : " + emp[i].empId);
                            System.out.println("Name        : " + emp[i].name);
                            System.out.println("Basic Salary: " + emp[i].basicSalary);
                            System.out.println("Bonus       : " + emp[i].bonus);
                            System.out.println("Total Salary: " + emp[i].totalSalary);
                            found = true;
                            break;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Salary Record Not Found!");
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