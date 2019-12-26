//Vibhav J.
//This is the control for Room #1.
//In order to run this, you must run StringRoomControl.java
import java.util.Scanner;

public class Room1
{
   public static Room3 room3 = new Room3();
   public static Room4 room4 = new Room4();
   public static StringInventorySystem strInventorySystem = new StringInventorySystem();
   public String directions[] = {"north", "south", "east", "west", "exit", "up"};
   public String firstRequest;
   public int visitCount = 0;
   public Scanner input1 = new Scanner(System.in);
   public Room1() //This allows for the creation of an object of this class to happen in other classes
   {
   
   }
   public void getInfoOnRoom1() //This is the start of the adventure in this room. 
   {
      visitCount++;
      System.out.println("You have entered Room #1. Your total visits to this room are " + visitCount + ". Where do you want to go?");
      room1Explorer();
   }
   public void room1Explorer()
   {
      System.out.println("Are you wearing anything other than your clothes? Let's check! *scans you*"); //This uses an array from another class that stores what the character is wearing.
      System.out.println();
      System.out.println("--------------------------------------------------");
      System.out.println("You are wearing the following items: ");
      for(String str : room4.isWearing)
      {
        System.out.print("" + str);
      }
      System.out.println();
      System.out.println("--------------------------------------------------");
      strInventorySystem.displayArrayList();
      System.out.println("You can choose to go the following directions: ");
      for(int i = 0; i <= directions.length - 1; i++)
      {
         System.out.println(directions[i]);
      }
      System.out.println("Please type in your direction in a complete sentence:");
      firstRequest = input1.nextLine();
      firstRequest = firstRequest.toLowerCase();
      String firstRequestAlt = "";
      if(firstRequest.indexOf("north") >= 0)
      {
         firstRequestAlt = "north";
      }
      else if(firstRequest.indexOf("south") >= 0)
      {
         firstRequestAlt = "south";
      }
      else if(firstRequest.indexOf("east") >= 0)
      {
         firstRequestAlt = "east";
      }
      else if(firstRequest.indexOf("west") >= 0)
      {
         firstRequestAlt = "west";
      }
      else if(firstRequest.indexOf("up") >= 0)
      {
         firstRequestAlt = "up";
      }
      else if(firstRequest.indexOf("exit") >= 0)
      {
         firstRequestAlt = "exit";
      }
      else{
         System.out.println("There was no direction that matched... try entering again.");
         room1Explorer();
      }
      System.out.println("You have chosen to go " + firstRequestAlt + ".");
      switch(firstRequestAlt)
      {
         case "north": room1North();
                        break;
         case "south": room1South();
                        break;
         case "east": room1East();
                        break;
         case "west": room1West();
                        break;
         case "exit": room1Exit();
                        break;
         case "up": room1Up();
                        break;
         default: System.out.println("There was no direction that matched... try entering again.");
                  room1Explorer();
                  break;
      }
   }
   public void room1North()
   {
      System.out.println("In the northern part of the room, there is some scary stuff that makes you think of something horrible.");
      room1Explorer();
   }
   public void room1South()
   {
      System.out.println("In the southern part of the room, there is some happy stuff that makes you think of having a good time.");
      room1Explorer();
   }
   public void room1East()
   {
      System.out.println("In the eastern part of the room, there are some dogs eating chicken sandwiches.");
      room1Explorer();
   }
   public void room1West()
   {
      System.out.println("In the western part of the room, there are some chickens eating dog sandwiches.");
      room1Explorer();
   }
   public boolean room1Exit()
   {
      System.out.println("This is the exit.");
      return true;
   }
   public void room1Up()
   {
      System.out.println("In the center of the room, there is a ladder that goes up to another room. You climbed it and now you are in Room #3.");
      room3.getInfoOnRoom3();
   }
}