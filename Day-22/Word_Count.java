import java.util.Scanner;
public class Word_Count
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        int words = 0;
        boolean inWord = false;
        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            if (ch != ' ') 
            {
                if (!inWord) 
                {
                    words++;
                    inWord = true;
                }
            }
            else 
            {
                inWord = false;
            }
        }
        System.out.println("Number of words = " + words);
    }
}