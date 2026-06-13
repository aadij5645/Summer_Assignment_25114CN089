import java.util.Scanner;
public class Array_Input
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of array: ");
        int limit = sc.nextInt();
        int array[] = new int[limit];
        System.out.println("Enter the elements of array");
        for(int i = 0; i < limit; i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println("The elements of array are: ");
        for(int i = 0; i < limit; i++)
        {
            System.out.print(array[i] + " ");
        }
    }    
}
