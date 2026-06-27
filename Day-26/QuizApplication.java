import java.util.Scanner;
public class QuizApplication 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("===== Quiz Application =====");
        System.out.println("\n1. What is the capital of India?");
        System.out.println("a) Mumbai");
        System.out.println("b) Delhi");
        System.out.println("c) Chennai");
        System.out.print("Answer: ");
        char ans = sc.next().charAt(0);
        if (ans == 'b' || ans == 'B')
            score++;
        System.out.println("\n2. Which language is used for Java programs?");
        System.out.println("a) C");
        System.out.println("b) Python");
        System.out.println("c) Java");
        System.out.print("Answer: ");
        ans = sc.next().charAt(0);
        if (ans == 'c' || ans == 'C')
            score++;
        System.out.println("\n3. 5 + 7 = ?");
        System.out.println("a) 10");
        System.out.println("b) 12");
        System.out.println("c) 15");
        System.out.print("Answer: ");
        ans = sc.next().charAt(0);
        if (ans == 'b' || ans == 'B')
            score++;
        System.out.println("\n4. Which planet is known as the Red Planet?");
        System.out.println("a) Mars");
        System.out.println("b) Earth");
        System.out.println("c) Venus");
        System.out.print("Answer: ");
        ans = sc.next().charAt(0);
        if (ans == 'a' || ans == 'A')
            score++;
        System.out.println("\n5. How many days are there in a week?");
        System.out.println("a) 5");
        System.out.println("b) 6");
        System.out.println("c) 7");
        System.out.print("Answer: ");
        ans = sc.next().charAt(0);
        if (ans == 'c' || ans == 'C')
            score++;
        System.out.println("\nYour Score: " + score + "/5");
    }
}