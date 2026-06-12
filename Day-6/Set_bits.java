import java.util.Scanner;
public class Set_bits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number, count = 0;
        System.out.println("Enter a number: ");
        number = sc.nextInt();
        while(number > 0)
        {
            count = count + (number % 2);
            number /= 2;
        }
        System.out.println("The number of set bits are " + count);
    }
}