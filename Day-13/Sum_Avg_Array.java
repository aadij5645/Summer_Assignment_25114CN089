import java.util.Scanner;
public class Sum_Avg_Array 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of array: ");
        int limit = sc.nextInt();
        int array[] = new int[limit];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < limit; i++)
        {
            array[i] = sc.nextInt();
        }
        int sum = 0 , avg;
        for(int i = 0; i < limit; i++)
        {
            sum += array[i];
        }
        avg = sum / limit;
        System.out.println("The sum of elemnets of array is " + sum);
        System.out.println("The average of elemnets of array is " + avg);
    }
}
