import java.util.Scanner;
public class Vowels_Consonants 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int vowel = 0, consonant = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z')
            {
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                    vowel++;
                else
                    consonant++;
            }   
        }
        System.out.println("Total vowels are " + vowel);
        System.out.println("Total consonants are " + consonant);
    }
}
