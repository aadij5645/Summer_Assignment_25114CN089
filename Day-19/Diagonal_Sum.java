import java.util.Scanner;
public class Diagonal_Sum 
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
        int sum = 0;
        for(int i = 0; i < row; i++)
            {
                for(int j = 0; j < column; j++)
                {
                    if(i == j)
                        sum += array[i][j];
                }
            } 
            System.out.println("Sum is " + sum);
    }
}
