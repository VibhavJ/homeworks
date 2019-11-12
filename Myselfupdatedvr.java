/* Vibhav Jaripatke
This code is used to store information on name, age, high school, and favorite school. Today's date is November 9th 2019.
*/
import java.util.Scanner;

public class Myselfupdatedvr
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      Scanner ca = new Scanner(System.in);
      Scanner an = new Scanner(System.in);
      System.out.println("What's your name?");
      String name = sc.nextLine(); // Scanner for input of name
      System.out.println("How old are you?");
      int age = sc.nextInt(); // Scanner for input of age
      System.out.println("What high school do you go to?");
      String highSchool = ca.nextLine(); // Scanner for input of high school name
      System.out.println("What is your favorite subject in school?");
      String favSubject = an.nextLine(); // Scanner for input of favorite subject
      System.out.println("Welcome to the S. I. R.");  // Format continues to the bottom of code
      System.out.println("-----------------------------------------");
      System.out.println("Student Information Record");
      System.out.println("-----------------------------------------");
      System.out.println("Information Attained on Personal Life: ");
      System.out.println();
      System.out.println("Student In Question: " + name);
      System.out.println();
      System.out.println("Age of Said Student: " + age);
      System.out.println();
      System.out.println("- More information yet to be attained -");
      System.out.println();
      System.out.println("-----------------------------------------");
      System.out.println("Information Attained on Education Level: ");
      System.out.println();
      System.out.println("High School That Student Is Currently In: " + highSchool);
      System.out.println();
      System.out.println("Student's Favorite Subject: " + favSubject);
      System.out.println();
      System.out.println("- More information yet to be attained -");
      System.out.println();
      System.out.println("            (End of Page)");
      System.out.println("-----------------------------------------");
   }
}