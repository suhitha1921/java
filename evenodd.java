import java.io.*;
import java.util.*;
public class Main
{
   public static void main(String[] args)
   {
      int a;
      System.out.println("Please enter a number to check even or odd:");
      Scanner sc = new Scanner(System.in);
      a = sc.nextInt();

      if(a % 2 == 0)
      {
         System.out.println("Entered number is an even number");
      }
      else
      {
         System.out.println("Entered number is an odd number");
      }
   }
}
