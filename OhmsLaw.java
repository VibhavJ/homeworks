//OhmsLaw.java
//Vibhav J.
//Ohm's Law is Voltage(in volts) = Resistance(in ohms) * Current(in amperes)
import java.util.Scanner;
public class OhmsLaw
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("What is the resistance?");
      int resistance = sc.nextInt(); //This asks the user what the resistance in the equation
      int[] voltageArr = new int[26];//This sets up an array to save the voltage based n the current values between 1 and 25
      for(int i = 0; i <= 25; i++)//This is used to store the values
      {
         int voltage = i * resistance;
         voltageArr[i] = voltage;
         System.out.println("The resistance of this equation given: " + resistance);
         System.out.println("The current in this equation is: " + i);
         System.out.println("The voltage of the equation is: " + voltageArr[i]); //This prints the voltage based on a certain value of curren
      }
   }
}