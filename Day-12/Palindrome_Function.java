import java.util.Scanner;
public class Palindrome_Function 
{
    static void palindrome(int num)
    {
        int temp = num, newnum = 0, rem;
        while(temp > 0)
        {
            rem = temp % 10;
            newnum = (newnum * 10) + rem;
            temp /= 10;
        }
        if(newnum == num)
            System.out.println(num + " is a palindrome number.");
        else
            System.out.println(num + " is not a palindrome number.");
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        palindrome(number);    
    }    
}
