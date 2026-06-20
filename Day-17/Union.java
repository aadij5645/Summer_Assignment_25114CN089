import java.util.Scanner;
public class Union 
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
        System.out.println("Union of arrays:");
        for(int i = 0; i < limit1; i++)
        {
            System.out.print(array1[i] + " ");
        }
        for(int i = 0; i < limit2; i++)
        {
            boolean dupli = false;
            for(int j = 0; j < limit1; j++)
            {
                if(array2[i] == array1[j])
                {
                    dupli = true;
                    break;
                }
            }
            if(!dupli)
                System.out.print(array2[i] + " ");
        }
    }
}
