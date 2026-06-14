import java.util.Scanner;
public class Second_Largest 
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
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for(int i = 0; i < limit; i++)
        {
            if(array[i] > largest)
            {
                second_largest = largest;
                largest = array[i];
            }
            else if(array[i] > second_largest && array[i] != largest)
            {
                second_largest = array[i];
            }
        }
        System.out.println("The second largest element in the array is " + second_largest);    
    }
}
