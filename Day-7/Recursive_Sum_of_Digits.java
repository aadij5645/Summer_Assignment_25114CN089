import java.util.Scanner;
public class Recursive_Sum_of_Digits 
{
    static int SumofDigits(int n)
    {
        if(n==0)
            return 0;
        return (n % 10) + SumofDigits(n/10);
    }    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        System.out.println("Sum of digits is " + SumofDigits(number));    
    }
}
