import java.util.Scanner;
public class power {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number, power, i, result = 1;
        System.out.println("Enter a number");
        number = sc.nextInt();
        System.out.println("Enter the power");
        power = sc.nextInt();
        for(i = 0; i<power; i++)
        {
            result = result * number;
        }
        System.out.println(number + " to the power " + power + " is " + result);
    }
}
