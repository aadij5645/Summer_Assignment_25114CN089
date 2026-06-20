import java.util.Scanner;
public class Intersection 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array");
        int limit1 = sc.nextInt();
        System.out.println("Enter size of second array");
        int limit2 = sc.nextInt();
        int array1[] = new int[limit1];
        int array2[] = new int[limit2];
        System.out.println("Enter elements of first array: ");
        for(int i = 0; i < limit1; i++)
        {
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter elements of second array: ");
        for(int i = 0; i < limit2; i++)
        {
            array2[i] = sc.nextInt();
        }
        System.out.println("Intersection is:");
        for(int i = 0; i < limit1; i++)
        {
            for(int j = 0; j < limit2; j++)
            {
                if(array1[i] == array2[j])
                {
                    System.out.print(array1[i] + " ");
                    break;
                }
            }
        }    
    }
}
