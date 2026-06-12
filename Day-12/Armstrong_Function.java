import java.util.Scanner;
public class Armstrong_Function
{
    static void armstrong(int num)
    {
        int temp1 = num, temp2 = num, rem, newnum = 0, count = 0;
        while(temp1 > 0)
        {
            rem = temp1 % 10;
            count++;
            temp1 /= 10;
        }
        while(temp2 > 0)
        {
            rem = temp2 % 10;
            newnum += (int)(Math.pow(rem, count));
            temp2 /= 10;
        }
        if(newnum == num)
            System.out.println(num + " is a armstrong number.");
        else
            System.out.println(num + " is not a armstrong number.");
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        armstrong(number);
    }
}