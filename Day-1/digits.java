import java.util.Scanner;
public class digits {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number, count=0;
        System.out.println("Enter a number to count its digits");
        number = sc.nextInt();
        while(number>0)
        {
            count++;
            number = number/10;
        }
        System.out.println("Total digits are " + count);
    }
}
