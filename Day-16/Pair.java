import java.util.Scanner;
public class Pair 
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
        System.out.println("Enter the sum: ");
        int sum = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < limit; i++)
        {
            for(int j = i+1; j < limit; j++)
            {
                if(array[i] + array[j] == sum)
                {
                    System.out.println("Pair found " + array[i] + " and " + array[j]);
                    found = true;;
                }
            }
        }
        if(!found)
            System.out.println("Pair not found.");
    }
}
