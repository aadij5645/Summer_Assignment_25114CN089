import java.util.Scanner;
public class Perfect_Function 
{
    static void perfect(int num)
    {
        int newnum = 0;
        for(int i = 1; i < num; i++)
        {
            if(num % i == 0)
                newnum += i;
        }
        if(newnum == num)
            System.out.println(num + " is a perfect number.");
        else
            System.out.println(num + " is not a perfect number.");
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        perfect(number);
    }
}
