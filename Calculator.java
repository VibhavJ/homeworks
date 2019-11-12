import java.util.Scanner;

public class Calculator
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      double fnum, snum, answer;
      System.out.println("Enter first number: ");
      fnum = sc.nextDouble();
      System.out.println("Enter second number: ");
      snum = sc.nextDouble();
      answer = fnum + snum;
      System.out.println(answer);
   }
}