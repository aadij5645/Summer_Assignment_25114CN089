import java.util.Scanner;
public class Selection_Sort 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int limit = sc.nextInt();
        int array[] = new int[limit];
        System.out.println("Enter the elments of an unsorted array:");
        for(int i = 0; i < limit; i++)
        {
            array[i] = sc.nextInt();
        } 
        int min, temp;
        for(int i = 0; i < limit - 1; i++)
        {
            min = i;
            for(int j = i + 1; j < limit; j++)
            {
                if(array[j] < array[min])
                    min = j;
            }
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        System.out.println("Sorted array:");
        for(int i = 0; i < limit; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
