import java.util.Scanner;
public class Rotate_Array_Left 
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
        for(int j = 0; j < rotations; j++)
        {
        int first = array[0];
        for(int i = 0; i < limit - 1; i++)
            {
                array[i] = array[i+1];
            }
        array[limit - 1] = first;
        }
        System.out.println("Rotated array is:");
        for(int i = 0; i < limit; i++)
            {
                System.out.print(array[i] + " ");
            }
    }
}