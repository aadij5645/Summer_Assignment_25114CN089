import java.util.Scanner;
public class digit_product {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number, product=1, temp;
        System.out.println("Enter a number");
        number = sc.nextInt();
        while(number>0)
        {
            temp = number%10;
            product*=temp;
            number/=10;
        }
        System.out.println("Product of digits is " + product);
    }
}
