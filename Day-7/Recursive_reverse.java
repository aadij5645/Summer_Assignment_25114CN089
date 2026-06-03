import java.util.Scanner;
public class Recursive_reverse 
{
    static int reverse = 0;
    static int reverse(int n)
    { 
        if(n == 0)
            return reverse;
        reverse = reverse * 10  + (n % 10);
        return reverse(n / 10);
    }    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        System.out.println("Reverse number is " + reverse(number));   
    }
}
