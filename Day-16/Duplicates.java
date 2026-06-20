import java.util.Scanner;
public class Duplicates 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int limit = sc.nextInt();
        int array[] = new int[limit];
        System.out.println("Enter array elements:");
        for (int i = 0; i < limit; i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println("Array without duplicates: ");
        for(int i = 0; i < limit; i++)
            {
                boolean duplicate = false;
                for(int j = 0; j < i; j++)
                {
                    if(array[i] == array[j])
                    {
                        duplicate = true;
                        break;
                    }
                }
                if(!duplicate)
                    System.out.println(array[i]);
            } 
    }
}
