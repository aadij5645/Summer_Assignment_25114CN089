import java.util.Scanner;
public class Prime_Function 
{
    static void prime(int num)
    {
        int count = 0;
        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
                count++;
        }
        if(count > 2)
            System.out.println(num + " is not a prime number.");
        else
            System.out.println(num + " is a prime number.");
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int number = sc.nextInt();
        prime(number);    
    }    
}
