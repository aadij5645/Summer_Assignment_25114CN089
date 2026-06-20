import java.util.Scanner;
public class Missing_Number  
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int limit = sc.nextInt();
        int array[] = new int[limit];
        System.out.println("Enter array elements:");
        for (int i = 0; i < limit; i++)
        {
            array[i] = sc.nextInt();
        }
        int n = limit + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < limit; i++) {
            actualSum += array[i];
        }
        int missing = expectedSum - actualSum;
        System.out.println("Missing number = " + missing);
    }
}
