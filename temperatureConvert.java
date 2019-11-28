//temperatureConvert.java
//Vibhav J.
import java.util.Scanner;
public class temperatureConvert
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      Scanner ca = new Scanner(System.in);
      System.out.println("What is the number of degrees?");
      double degrees = sc.nextInt(); //saves the degrees
      System.out.println("Is it fahrenheit or celsius?(Type 1 for fahrenheit and 2 for celsius.)");
      int tempType = ca.nextInt(); //saves the unit of temperature
      if(tempType == 1){
         double degCelsius = ((degrees) * (9.0 / 5.0)) + 32.0; //This is the conversion of Fahrenheit to Celsius
         System.out.println("The temperature in Fahrenheit given: " + degrees);
         System.out.println("The temperature converted into Celsius: " + degCelsius);
      }
      else if(tempType == 2){
         double degFahrenheit = (degrees - 32.0) * (5.0 / 9.0); //This is the conversion of Celsius to Fahrenheit
         System.out.println("The temperature in Celsius given: " + degrees);
         System.out.println("The temperature converted into Fahrenheit: " + degFahrenheit);
      }
   }
}