import java.util.Scanner;
public class sum
{
    public static void main(String[] args)
    {
        int n, i, result=0;
        System.out.println("Enter the limit");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=1; i<=n; i++)
        {
            result+=i;
        }
        System.out.println("Result is " + result);
    }
}