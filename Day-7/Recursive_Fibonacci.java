import java.util.Scanner;
public class Recursive_Fibonacci 
{
    static int fibonacci(int n)
    {
        if(n == 1)
            return 0;
        if(n == 2)
            return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int terms = sc.nextInt();
        for(int i = 1; i <= terms; i++)
        {
        System.out.println("Fibonacci series is " + fibonacci(i));
        }
    }
}