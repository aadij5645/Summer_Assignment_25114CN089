import java.util.Scanner;
public class StringCompression 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        int count = 1;
        for (int i = 0; i < str.length(); i++) 
        {
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) 
            {
                count++;
                i++;
            }
            System.out.print(str.charAt(i));
            System.out.print(count);
            count = 1;
        }
    }
}