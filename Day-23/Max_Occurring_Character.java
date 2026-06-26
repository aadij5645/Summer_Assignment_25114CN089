import java.util.Scanner;
public class Max_Occurring_Character 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char maxChar = ' ';
        int maxCount = 0;
        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            if (ch == ' ')
            {
                continue;
            }
            int count = 0;
            for (int j = 0; j < str.length(); j++) 
            {
                if (ch == str.charAt(j)) 
                {
                    count++;
                }
            }
            if (count > maxCount) 
            {
                maxCount = count;
                maxChar = ch;
            }
        }
        System.out.println("Maximum occurring character: " + maxChar);
        System.out.println("Frequency: " + maxCount);
    }
}