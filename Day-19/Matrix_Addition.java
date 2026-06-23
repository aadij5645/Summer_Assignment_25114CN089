import java.util.Scanner;
public class Matrix_Addition 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int row = sc.nextInt();
        System.out.println("Enter no of columns:");
        int column = sc.nextInt();    
        int[][] array1 = new int[row][column];
        int[][] array2 = new int[row][column];
        System.out.println("Enter elements of first matrix:");
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix:");
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                array2[i][j] = sc.nextInt();
            }
        }
        int[][] sum = new int[row][column];
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                sum[i][j] = array1[i][j] + array2[i][j];
            }
        }
        System.out.println("Sum of the matrices is:");
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
