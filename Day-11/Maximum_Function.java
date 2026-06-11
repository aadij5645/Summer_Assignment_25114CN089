import java.util.Scanner;
public class Maximum_Function 
{
    static void max(int num1, int num2)
    {
        if(num1 > num2)
            System.out.println(num1 + " is maximum.");
        else
            System.out.println(num2 + " is maximum.");
        
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1 = sc.nextInt();
        System.out.println("Enter second number:");
        int n2 = sc.nextInt();
        max(n1,n2);    
    }    
}
