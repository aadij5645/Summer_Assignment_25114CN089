import java.util.Scanner;

public class digit_sum {
   public digit_sum() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var3 = 0;
      System.out.println("Enter a number");

      for(int var2 = var1.nextInt(); var2 > 0; var2 /= 10) {
         int var4 = var2 % 10;
         var3 += var4;
      }

      System.out.println("Sum of digits is " + var3);
   }
}
