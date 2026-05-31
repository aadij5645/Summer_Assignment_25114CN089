import java.util.Scanner;
public class Armstrong_in_range {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count, sum, temp1, temp2, digit, lowerlimit, upperlimit;
        System.out.println("Enter the lowerlimit");
        lowerlimit = sc.nextInt();
        System.out.println("Enter the upperlimit");
        upperlimit = sc.nextInt();
        for(int i = lowerlimit; i<=upperlimit; i++)
        {
            temp1 = i;
            temp2 = i;
            sum = 0;
            count = 0;
            while(temp1>0)
            {
                count += 1;
                temp1 /= 10;
            }
            while(temp2>0)
            {
                digit = temp2 % 10;
                sum += Math.pow(digit,count);
                temp2 /= 10;
            }
            if(sum == i)
                System.out.println(i);
        }
    }
}