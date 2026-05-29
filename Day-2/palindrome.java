import java.util.Scanner;
public class palindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number, newnum=0, tempnum, flag;
        System.out.println("Enter a number");
        number = sc.nextInt();
        tempnum = number;
        while(tempnum>0)
        {
            flag = tempnum%10;
            newnum = (newnum*10)+flag;
            tempnum/=10; 
        }
        if(newnum == number)
        {
            System.out.println("The given number is a palindrome number");
        }
        else
        {
            System.out.println("The given number is not a palindrome number");
        }
    }
}
