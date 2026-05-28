import java.util.Scanner;
public class table {
    public static void main(String[] args)
    {
        int number, i;
        System.out.println("Enter a number for its table");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        for(i=1; i<=10; i++)
        {
            System.out.println(number + " x " + i + " = " + (number*i));
        }
    }
}
