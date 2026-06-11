import java.util.Scanner;
public class Factorial_Function 
{
    static void factorial(int num)
    {
        int fact = 1;
        for(int i = 1; i <= num; i++)
            fact *= i;
        System.out.println("Factorial of " + num + " is " + fact);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        factorial(number);    
    }    
}
