import java.util.Scanner;
public class Maximum_Frequency 
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
        int maxfre = 0, element = array[0], count;
        for(int i = 0; i < limit; i++)
        {
            count = 0;
            for(int j = 0; j < limit; j++)
            {
                if(array[i] == array[j])
                    count++;
            }
            if(count > maxfre)
            {
                maxfre = count;
                element = array[i];
            }
        }
        System.out.println("Element with maximum frequency is " + element + " which occurs " + maxfre + " times.");
    }
}
