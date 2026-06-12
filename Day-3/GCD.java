import java.util.Scanner;
public class GCD {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1, num2, gcd=1, i, greater;
        System.out.println("Enter First number");
        num1 = sc.nextInt();
        System.out.println("Enter Second number");
        num2 = sc.nextInt();
        if(num1>num2)
            greater = num1;
        else
            greater = num2;
        for(i=1; i<=greater; i++)
        {
            if(num1%i==0 && num2%i==0)
                gcd=i;
        }
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);
    }
}