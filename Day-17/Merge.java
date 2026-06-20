import java.util.Scanner;
public class Merge 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array");
        int limit1 = sc.nextInt();
        System.out.println("Enter size of second array");
        int limit2 = sc.nextInt();
        int limit = limit1 + limit2;
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
        int newarr[] = new int[limit];
        for(int i = 0; i < limit; i++)
        {
            if(i < limit1)
                newarr[i] = array1[i];
            else
                newarr[i] = array2[i - limit1];
        }
        System.out.println("Merged array is: ");
        for(int i = 0; i < limit; i++)
        {
            System.out.print(newarr[i] + " ");
        }
    }
}