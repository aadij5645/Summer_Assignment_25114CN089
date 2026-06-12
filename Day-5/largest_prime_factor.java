import java.util.Scanner;
public class largest_prime_factor {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number, i, largest_factor = 1;
        System.out.println("Enter a number.");
        number = sc.nextInt();
        for(i=2; i<=number; i++)
        {
            while(number%i==0){
                largest_factor = i;
            number /= i;
        }
    }
        System.out.println("Largest prime factor is: " + largest_factor);
    }
}
