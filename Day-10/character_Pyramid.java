import java.util.Scanner;
public class character_Pyramid 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= rows - i; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++)
            {
                System.out.print((char)(k+64));
            }
            for(int l = i-1; l >= 1; l--)
            {
                System.out.print((char)(l+64));
            }
            System.out.println();
        }
    }    
}
