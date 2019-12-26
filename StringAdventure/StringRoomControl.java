//Vibhav J.
//This controls all rooms throughout the files
//This file is the file that shall be run. It accesses information from the other classes in the other java files so it is necessary to open all of the files before running.
import java.util.Scanner;
import java.lang.*;

public class StringRoomControl
{
   public static Room1 room1 = new Room1();
   public static Room2 room2 = new Room2();
   public static Room4 room4 = new Room4();
   public static Scanner input1 = new Scanner(System.in);
   public static boolean endGameRequest = false;
   public static void main(String[] args)
   {
      do{
         roomChooser();
      } while(!endGameRequest);
      System.out.println("Thanks for playing!");
      programExit();
   }
   public static void roomChooser()
   {
      room4.isWearing.add("clothes");
      System.out.println("Which room do you want to go to?");
      String answer1 = input1.nextLine();
      answer1 = answer1.toLowerCase();
      if(answer1.indexOf("room1") >= 0)
      {
         System.out.println("It looks like you want to go to Room 1.");
         room1.getInfoOnRoom1();
      }
      else if(answer1.indexOf("room2") >= 0)
      {
         System.out.println("It looks lik you want to go to Room 2.");
         room2.getInfoOnRoom2();
      }
      else{
         System.out.println("The room you named is not recognized.");
      }
      System.out.println("Do you want to end the adventure?");
      String answer2 = input1.nextLine();
      answer2 = answer2.toLowerCase();
      if(answer2.indexOf("yes") >= 0)
      {
         endGameRequest = true;
         return;
      }
      else{
         System.out.print("Here we go again!");
         roomChooser();
      }
   }
   public static void programExit()
   {
      System.out.println("The system will now exit.");
      System.exit(0);
   }
}