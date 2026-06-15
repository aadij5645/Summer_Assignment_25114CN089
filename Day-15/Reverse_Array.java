import java.util.Scanner;
public class Reverse_Array
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
        int newarr[] = new int[limit];
        int flag = limit - 1;
        for(int i = 0; i < limit; i++)
        {
            newarr[i] = array[flag];
            flag--;
        }
        System.out.println("Reversed array is:");
        for(int i = 0; i < limit; i++)
        {
            System.out.print(newarr[i] + " ");
        }
    }
}