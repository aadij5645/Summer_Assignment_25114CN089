import java.util.Scanner;
public class Repeated_Number_Pattern 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int rows;
        System.out.println("Enter number of rows");
        rows = sc.nextInt();
        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }    
}
