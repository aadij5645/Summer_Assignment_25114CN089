import java.util.Scanner;
public class Reverse_Number_Triangle 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int rows;
        System.out.println("Enter number of rows");
        rows = sc.nextInt();
        for(int i = 1; i <= rows; i++)
            {
                int flag = 1;
                for(int j = rows; j >= i; j--)
                {
                    System.out.print(flag + " ");
                    flag++;
                }
                System.out.println("");
            }    
    }    
}
