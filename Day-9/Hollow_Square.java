import java.util.Scanner;
public class Hollow_Square 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int rows;
        System.out.println("Enter number of rows");
        rows = sc.nextInt();
        for(int i = 1; i <= rows; i++)
            {
                for(int j = 1; j <= rows; j++)
                {
                    if(i == 1 || i == rows || j == 1 || j == rows)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                System.out.println("");
            }    
    }    
}
