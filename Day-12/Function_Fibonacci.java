import java.util.Scanner;
public class Function_Fibonacci
{
    static void fibonacci(int lim)
    {
        int n1 = 0, n2 = 1, n3;
        if(lim == 0)
            System.out.print("Limit is invalid");
        else if(lim == 1)
            System.out.print(n1 + " ");
        else
        System.out.print(n1 + " " + n2 + " ");
        for(int i = 3; i <= lim; i++)
        {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
        public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit starting from 1: ");
        int limit = sc.nextInt();
        fibonacci(limit);    
    }
}