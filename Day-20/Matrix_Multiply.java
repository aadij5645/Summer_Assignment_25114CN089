import java.util.Scanner;
public class Matrix_Multiply 
{
    public static void main(String[] args)  
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row of first matrix:");
        int row1 = sc.nextInt();
        System.out.println("Enter number of column of first matrix:");
        int column1 = sc.nextInt();    
        System.out.println("Enter number of row of second matrix:");
        int row2 = sc.nextInt();
        System.out.println("Enter number of column of second matrix:");
        int column2 = sc.nextInt();
        int[][] matrix1 = new int[row1][column1];
        int[][] matrix2 = new int[row2][column2];
        if(column1 != row2)
        {
            System.out.println("Invalid input.");
            System.exit(0);
        }
        System.out.println("Enter elements of first matrix:");
        for(int i = 0; i < row1; i++)
        {
            for(int j = 0; j < column1; j++)
            {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix:");
        for(int i = 0; i < row2; i++)
        {
            for(int j = 0; j < column2; j++)
            {
                matrix2[i][j] = sc.nextInt();
            }
        }
        int[][] multi = new int[row1][column2];
        for(int i = 0; i < row1; i++)
        {
            for(int j = 0; j < column2; j++)
            {
                for(int k = 0; k < column1; k++)
                {
                    multi[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Resultant matrix:");
        for(int i = 0; i < row1; i++)
        {
            for(int j = 0; j < column2; j++)
            {
                System.out.print(multi[i][j] + " ");
            }
            System.out.println();
        }
    }
}
