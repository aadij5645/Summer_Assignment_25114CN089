import java.util.Scanner;
public class Anagram 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().toLowerCase();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().toLowerCase();
        if (str1.length() != str2.length()) 
        {
            System.out.println("Not Anagram");
            return;
        }
        boolean isAnagram = true;
        for (int i = 0; i < str1.length(); i++) 
        {
            char ch = str1.charAt(i);
            int count1 = 0, count2 = 0;
            for (int j = 0; j < str1.length(); j++) 
            {
                if (str1.charAt(j) == ch)
                    count1++;
            }
            for (int j = 0; j < str2.length(); j++) 
            {
                if (str2.charAt(j) == ch)
                    count2++;
            }
            if (count1 != count2) 
            {
                isAnagram = false;
                break;
            }
        }
        if (isAnagram)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}