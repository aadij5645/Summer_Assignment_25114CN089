 import java.util.Scanner;
public class String_Length 
{   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int count = 0;
        for (char c : ch) 
        {
            count++;
        }
        System.out.println("Length of the string = " + count);
    }
}