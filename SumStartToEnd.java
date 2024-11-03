import java.util.Scanner;
public class SumStartToEnd{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter start: ");
      int start = input.nextInt();
      System.out.print("Enter end: ");
      int end = input.nextInt();
      if (start >= end){
         System.out.println("Error: start should be less than end.");
      }
      else {
         int sum = 0;
         while (start <= end ) {
            sum = sum + start;
            start = start + 1;
         }
         System.out.printf("Sum is %d%n", sum);
      }
   }
}