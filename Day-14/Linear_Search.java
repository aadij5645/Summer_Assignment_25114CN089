import java.util.Scanner;
public class Linear_Search
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
        System.out.println("Enter the element to search: ");
        int search = sc.nextInt();
        int position = 0, flag = 0;
        for(int i = 0; i < limit; i++)
        {
            if(array[i] == search)
            {
                flag = 1;
                position = i+1;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println("Element found at " + position + " place.");
        }    
        else
            System.out.println("Element not found.");
    }
}