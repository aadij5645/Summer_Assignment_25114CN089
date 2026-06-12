import java.util.Scanner;
public class Character_Triangle 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int rows;
        System.out.println("Enter number of rows");
        rows = sc.nextInt();
        for(int i = 1; i <= rows; i++)
            {
                for(char j = 1; j <= i; j++)
                {
                    System.out.print( (char)(j+64) + " ");
                }
                System.out.println("");
            }    
    }    
}
