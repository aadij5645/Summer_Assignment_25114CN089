import java.util.Scanner;
public class Binary_to_decimal 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int binary, decimal = 0, base = 1, rem;
        System.out.println("Enter a binary number: ");
        binary = sc.nextInt();
        while(binary>0)
        {
            rem = binary % 10;
            decimal += rem * base;
            base *= 2;
            binary /=10;
        }
        System.out.println("The number in decimal is " + decimal);
    }
}
