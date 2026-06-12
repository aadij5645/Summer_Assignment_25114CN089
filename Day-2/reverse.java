import java.util.Scanner;
public class reverse {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number, newnum=0, temp;
        System.out.println("Enter a number");
        number = sc.nextInt();
        while(number>0)
        {
            temp = number%10;
            newnum = (newnum*10)+temp;
            number/=10;
        }
        System.out.println("Reversed number is " + newnum);
    }
}
