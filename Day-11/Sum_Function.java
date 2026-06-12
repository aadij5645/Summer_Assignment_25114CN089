import java.util.Scanner;
public class Sum_Function
{
   static void sum(int num1, int num2)
    {
        int result = num1 + num2;
        System.out.println("Sum of both the numbers is " + result);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1 = sc.nextInt();
        System.out.println("Enter second number:");
        int n2 = sc.nextInt();
        sum(n1,n2);
    }
}