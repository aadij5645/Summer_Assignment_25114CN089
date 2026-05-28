import java.util.Scanner;
public class factorial {
    public static void main(String[] args)
    {
        int number, i, fact=1;
        System.out.println("Enter any number to get its factorial");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        for(i=number; i>=1; i--)
        {
            fact*=i;
        }
        System.out.println("Factorial of " + number + " is " + fact);
    }
}
