import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number, count = 0, sum = 0, temp1, temp2, digit;
        System.out.println("Enter a number");
        number = sc.nextInt();
        temp1 = number;
        temp2 = number;
        while(temp1>0)
        {
            count += 1;
            temp1 /= 10;
        }
        while(temp2>0)
        {
            digit = temp2 % 10;
            sum += Math.pow(digit,count);
            temp2 /= 10;
        }
        if(sum == number)
            System.out.println(number + " is an armstrong number.");
        else
            System.out.println(number + " is not an armstrong number.");
    }
}
