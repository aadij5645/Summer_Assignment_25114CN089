import java.util.Scanner;
public class fibonacci_nth_term {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int position, n1 = 0, n2 = 1, n3 = 0;
        System.out.println("Enter the position of the term you want to know");
        position = sc.nextInt();
        if(position == 1)
        {
            System.out.println(position + "st term is " + n1);
        }
        else if(position == 2)
        {
            System.out.println(position + "th term is " + n2);
        }
        else
        {
            for(int i =3; i<=position; i++)
            {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
            System.out.println(position + "th term is " + n3);
        }
    }
}
