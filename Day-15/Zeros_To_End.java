import java.util.Scanner;
public class Zeros_To_End 
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
        int flag = 0, temp;
        for(int i = 0; i < limit; i++)
            {
                if(array[i] != 0)
                {
                    array[flag] = array[i];
                    flag++;
                }
            }
            while (flag < limit) 
            {
                array[flag] = 0;
                flag++;    
            }
        for(int i = 0; i < limit; i++)
            {
                System.out.print(array[i] + " ");
            }     
    }
}
