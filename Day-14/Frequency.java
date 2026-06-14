import java.util.Scanner;
public class Frequency 
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
        System.out.println("Enter the element to find its frequency: ");
        int element = sc.nextInt();
        int frequency = 0;
        for(int i = 0; i < limit; i++)
        {
            if(array[i] == element)
                frequency++;
        }    
        System.out.println(element + " occurs " + frequency + " times.");
    }
}
