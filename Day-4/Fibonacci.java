import java.util.Scanner;
public class Fibonacci
{
    public static void main(String[] args)
    {
        java.util.Scanner sc = new Scanner(System.in);
        int n1 = 0, n2 = 1, n3, limit;
        System.out.println("Enter the limit upto which you want the Fibonacci Series");
        limit = sc.nextInt();
        System.out.print(n1 + " " + n2);
        for(int i = 3; i<=limit; i++)
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}