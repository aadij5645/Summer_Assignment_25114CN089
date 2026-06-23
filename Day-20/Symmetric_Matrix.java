import java.util.Scanner;
public class Symmetric_Matrix 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int column = sc.nextInt();    
        int[][] matrix = new int[row][column];
        int[][] newmat = new int[row][column];
        int flag = 0;
        System.out.println("Enter elements of the matrix:");
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                newmat[j][i] = matrix[i][j];
            }
        }
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                if(newmat[i][j] != matrix[i][j])
                {
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 1)
            System.out.println("Not a symmetric matrix.");
        else
            System.out.println("Symmetric matrix.");
    }
}
