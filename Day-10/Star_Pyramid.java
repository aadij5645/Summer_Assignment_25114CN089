import java.util.Scanner;
public class Star_Pyramid
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int i, j, k, rows;
        System.out.println("Enter the number of rows");
        rows = sc.nextInt();
        for(i = 1; i <= rows; i++)
        {
            for(j = 1; j <= (rows - i); j++)
            {
                System.out.print(" ");
            }
            for(k = 1; k <= (2 * i - 1); k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}