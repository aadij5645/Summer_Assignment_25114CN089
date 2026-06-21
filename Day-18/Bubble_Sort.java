import java.util.Scanner;
public class Bubble_Sort 
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
        int temp;
        for(int i = 0; i < limit - 1; i++)
        {
            if(array[i] > array[i + 1])
            {
                temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
            }
        }
        System.out.println("Sorted array:");
        for(int i = 0; i < limit; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}