import java.util.Scanner;
public class Binary_Search 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int limit = sc.nextInt();
        int array[] = new int[limit];
        System.out.println("Enter the elments of a sorted array:");
        for(int i = 0; i < limit; i++)
        {
            array[i] = sc.nextInt();
        }    
        System.out.println("Enter the element to search:");
        int search = sc.nextInt();
        int start = 0, end = limit - 1, mid = (start + end)/2;
        while(start <= end && array[mid] != search)
        {
            if(search > array[mid])
                start = mid + 1;
            else
                end = mid - 1;
            mid = (start + end)/2;
        }
        if(array[mid] == search)
            System.out.println(search + " found at " + (mid + 1) + " place.");
        else
            System.out.println("Element not found.");
    }
}