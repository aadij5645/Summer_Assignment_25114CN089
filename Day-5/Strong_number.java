import java.util.Scanner;
public class Strong_number {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number, fact, i, temp, digit, sum = 0;
        System.out.println( "Enter a number");
        number = sc.nextInt();
        temp = number;
        while(temp>0)
        {
            fact = 1;
            digit = temp%10;
            for(i=digit; i>=1; i--)
            {
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }
        if(sum == number)
            System.out.println(number + " is a strong number.");
        else
            System.out.println(number + " is not a strong number.");
    }
}
