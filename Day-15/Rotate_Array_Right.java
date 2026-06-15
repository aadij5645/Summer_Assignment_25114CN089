import java.util.Scanner;
public class Rotate_Array_Right 
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
        System.out.println("Enter number of rotations:");
        int rotations = sc.nextInt();
        rotations %= limit;
        for(int i = 0; i < rotations; i++)
            {
                int last = array[limit - 1];
                for(int j = limit - 1; j > 0; j--)
                {
                    array[j] = array[j - 1];
                }
                array[0] = last;
            }
        System.out.println("Rotated array is:");
        for(int i = 0; i < limit; i++)
            {
                System.out.print(array[i] + " ");
            }    
    }
}
