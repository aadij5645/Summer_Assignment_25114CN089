import java.util.Scanner;
public class Decimal_to_Binary 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int number;
        String binary = "";
        System.out.println("Enter a decimal number: ");
        number = sc.nextInt();
        while (number > 0) 
        {
            binary = (number % 2) + binary;
            number = number / 2;
        }
        System.out.println("Binary number: " + binary);
    }
}
