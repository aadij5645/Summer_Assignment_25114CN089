import java.util.Scanner;
public class Even_Odd 
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
        int evencount = 0, oddcount = 0;
        for(int i = 0; i < limit; i++)
        {
            if(array[i] % 2 == 0)
                evencount++;
            else
                oddcount++;
        }
        System.out.println("Number of even elements are " + evencount);
        System.out.println("Number of odd elements are " + oddcount);
    }
}
