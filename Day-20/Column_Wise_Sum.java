import java.util.Scanner;
public class Column_Wise_Sum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int column = sc.nextInt();    
        int[][] matrix = new int[row][column];
        int sum;
        System.out.println("Enter elements of the matrix:");
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }    
        for(int i = 0; i < column; i++)
        {
            sum = 0;
            for(int j = 0; j < column; j++)
            {
                sum += matrix[j][i];
            }
            System.out.println("Sum of " + (i+1) + " column is " + sum);
        }
    }
}
