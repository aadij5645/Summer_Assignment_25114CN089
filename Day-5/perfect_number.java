import java.util.Scanner;
public class perfect_number {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number, i, sum = 0;
        System.out.println("Enter a nnumber");
        number = sc.nextInt();
        for(i=1; i<number; i++)
        {
            if(number % i == 0)
                sum += i;
        }
        if(sum == number)
            System.out.println(number + " is a perfect number.");
        else
            System.out.println(number + " is not a perfect number.");
    }    
}
