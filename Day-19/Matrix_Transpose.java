import java.util.Scanner;
public class Matrix_Transpose 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int row = sc.nextInt();
        System.out.println("Enter no of columns:");
        int column = sc.nextInt();    
        int[][] array = new int[row][column];
        System.out.println("Enter elements of the matrix:");
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                array[i][j] = sc.nextInt();
            }
        } 
        System.out.println("Transposed matrix:");
        for(int i = 0; i < column; i++)
        {
            for(int j = 0; j < row; j++)
            {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        } 
    }
}