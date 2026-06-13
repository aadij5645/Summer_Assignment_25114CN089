import java.util.Scanner;
public class Largest_Smallest 
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
        int smallest = array[0], largest = array[0];
        for(int i = 1; i < limit; i++)
            {
                if(smallest > array[i])
                    smallest = array[i];
                if(largest < array[i])
                    largest = array[i];
            }    
        System.out.println("Smallest element in the array is " + smallest);
        System.out.println("largest element in the array is " + largest);
    }
}