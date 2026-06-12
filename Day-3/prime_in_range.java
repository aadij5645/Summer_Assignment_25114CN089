import java.util.Scanner;
public class prime_in_range {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int upperlimit, lowerlimit, count=0, i, j;
        System.out.println("Enter lower limit");
        lowerlimit = sc.nextInt();
        System.out.println("Enter upper limit");
        upperlimit = sc.nextInt();
        System.out.println("The prime numbers from " + lowerlimit + " to " + upperlimit + " are: ");
        for(i=lowerlimit; i<=upperlimit; i++)
        {
            count = 0;
            for(j=1; j<=i; j++)
            {
            if(i%j==0)
                count++;
            }
            if(count<=2)
                System.out.println(i);
        }
    }
}
