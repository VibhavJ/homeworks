//Vibhav J.
//This is the control for Room #3.
//In order to run this, you must run StringRoomControl.java
import java.util.*;

public class Room3
{
   public static Room1 room1 = new Room1();
   public static Room4 room4 = new Room4();
   public static StringInventorySystem strInventorySystem = new StringInventorySystem();
   public String directions[] = {"left", "right", "down"};
   public String pickUpItems[] = {"bat", "magical staff", "pizza box"};
   public String actionWords[] = {"pick up", "put down", "smell", "store", "swing", "run", "keep", "walk", "eat"};
   public ArrayList<String> InventoryTwo = new ArrayList<String>();
   public String firstRequest = "";
   public int visitCount = 0;
   public String firstRequestAlt = "";
   public Scanner input1 = new Scanner(System.in);
   public String tempAnswer = "";
   public String tempAnswer2 = "";
   public Room3() //This allows for the creation of an object of this class to happen in other classes
   {
         
   }
   public void getInfoOnRoom3() //This is the start of the adventure in this room.
   {
      visitCount++;
      System.out.println("You hve entered #3 of the room of infinite enigmas. Your total visits to this specific room are/is " + visitCount + ". Where do you want to go?\n");
      room3Explorer();
   }
   public void room3Explorer()
   {
      System.out.println("Are you wearing anything other than your clothes? Let's check! *scans you*"); //This uses an array from another class that stores what the character is wearing.
      System.out.println();
      System.out.println("--------------------------------------------------");
      System.out.println("You are wearing the following items: ");
      for(String str : room4.isWearing)
      {
        System.out.print("" + str);
      }
      strInventorySystem.displayArrayList();
      System.out.println();
      System.out.println("--------------------------------------------------");
      System.out.println("You can choose to go the following directions and action words: ");
      System.out.println("Directions:");
      for(int i = 0; i <= directions.length - 1; i++)
      {
         System.out.println(directions[i]);
      }
      System.out.println("Action Words:");
      for(int i = 0; i <= actionWords.length - 1; i++)
      {
         System.out.println(actionWords[i]);
      }
      System.out.println("\nIf you want to leave this room type in \"down\" to go back to Room #1. If you do not want to leave, type in \"stay\".");
      firstRequest = input1.nextLine();
      firstRequest = firstRequest.toLowerCase();
      if(firstRequest.indexOf("exit") >= 0)
      {
         firstRequestAlt = "exit";
         System.out.println("You will now exit the room. Goodbye.\n");
         gameOver();
      }
      else{
         System.out.println("I'm glad you decided to stay!");
         room3Continue();
      }
   }
   void gameOver()
   {
      System.out.println("gameOver() called.\n");
      StringRoomControl.programExit();
      return;
   }
   public void room3Continue()
   {
      System.out.println("So what direction do you wanna go? By the way, here are the possible directions again: ");
      for(int i = 0; i <= directions.length - 1; i++)
      {
         System.out.println(directions[i]);
      }
      firstRequest = input1.nextLine();
      firstRequest = firstRequest.toLowerCase();
      if(firstRequest.indexOf("left") >= 0)
      {
         System.out.println("On the left side of the room, you see a wooden staff that is emitting purple sparks out of the top and a baseball bat leaning on the wall... It seems someone was here.\n" +
         "Would you like to stay to see if there really was someone here or do you want to go back down to Room #1?\n");
         firstRequest = input1.nextLine();
         firstRequest = firstRequest.toLowerCase();
         if(firstRequest.indexOf("stay") >= 0)
         {
            System.out.println("Stay it is then... if someone really is here, you should be able to defend yourself so I reccomend either getting the magical staff or the bat. So which one will you use to protect yourself?");
            firstRequest = input1.nextLine();
            firstRequest = firstRequest.toLowerCase();
            if(firstRequest.indexOf("staff") >= 0)
            {
               System.out.println("Great choice! It shoots at a wide range so you've chosen a great defense mechanism. *strange laughter*\n" + 
                  "So there really is someone here... Want to stay or go down to Room #1 to escape the thing that made the strange laughter?");
               firstRequest = input1.nextLine();
               firstRequest = firstRequest.toLowerCase();
               if(firstRequest.indexOf("stay") >= 0)
               {
                  System.out.println("The thing that made the strange laughter was a shapeshifter and it turns into a beast of some sort and lunges at you.\n" + 
                     "Your staff shoots a spark at the monster but since the monster is too close, the spark blows up near you too, thus killing you." + 
                     "I am deeply saddened by your passing.");
                  gameOver();
               }
               else if(firstRequest.indexOf("down") >= 0)
               {
                  System.out.println("Off to room #1 you go! Bye! Have as nice of a day as you can!");
                  room1.getInfoOnRoom1();
               } 
            }
            else if(firstRequest.indexOf("bat") >= 0)
            {
               System.out.println("Great choice! It packs a strong punch against close objects. *strange laughter*\n" + 
                  "So there really is someone here... Want to stay or go down to Room #1 to escape the thing that made the strange laughter?");
               firstRequest = input1.nextLine();
               firstRequest = firstRequest.toLowerCase();
               if(firstRequest.indexOf("stay") >= 0)
               {
                  System.out.println("The thing that made the strange laughter was a shapeshifter and it turns into a beast of some sort and lunges at you.\n" + 
                     "You hit your bat at his head with a strong lunge and severely harm him, causing him to run away through a portal back to his dimension.\n" + 
                     "You decide that you want to find a way out and so you go down the ladder to Room #1 in hopes of finding your way out.");
                  InventoryTwo.add("bat");
                  room1.getInfoOnRoom1();
               }
               else if(firstRequest.indexOf("down") >= 0)
               {
                  System.out.println("Off to room #1 you go! Bye! Have as nice of a day as you can!");
                  room1.getInfoOnRoom1();
               }
            }
         }
         else if(firstRequest.indexOf("down") >= 0)
         {
            System.out.println("Off to room #1 you go! Bye! Have as nice of a day as you can!");
            room1.getInfoOnRoom1();
         }  
      }
      else if(firstRequest.indexOf("right") >= 0)
      {
         System.out.println("On the right side of the room, there is a box of pizza and a mysterious door. Would you like to go to the pizza or the door?");
         firstRequest = input1.nextLine();
         firstRequest = firstRequest.toLowerCase();
         if(firstRequest.indexOf("pizza") >= 0)
         {
            System.out.println("Nice choice! I would actually go for the pizza myself... if I wasn't a robot and I could eat it without exploding. Anyways, you now walk up to the pizza box.\n" +  
            "Do you want to pick it up?");
            firstRequest = input1.nextLine();
            firstRequest = firstRequest.toLowerCase();
            if(firstRequest.indexOf("yes") >= 0)
            {
                  System.out.println("Do you want to store the pizza or eat it right here and now?");
                  firstRequest = input1.nextLine();
                  firstRequest = firstRequest.toLowerCase();
                  if(firstRequest.indexOf("store") >= 0)
                  {
                    System.out.println("You stored the box of pizza.\n");
	                 InventoryTwo.add("pizza box");
                    strInventorySystem.displayArrayList();
                    System.out.println("Do you want to go to the door now or go down to Room #1?");
                    firstRequest = input1.nextLine();
                    firstRequest = firstRequest.toLowerCase();
                    if(firstRequest.indexOf("door") >= 0)
                    {
                        System.out.println("Off you go to Room #4 then! Bye! Have a great life! I hope to see you again... you made today less boring, waiting around for someone to come here!");
                        room4.getInfoOnRoom4();
                    }
                    else if(firstRequest.indexOf("down") >= 0)
                    {
                        System.out.println("Off to room #1 you go! Bye! Have as nice of a day as you can!");
                        room1.getInfoOnRoom1();
                    }
                  }
                  else if(firstRequest.indexOf("eat") >= 0)
                  {
                    System.out.println("You ate the pizza! How was it? *static appears in the background of the robot's voice*\n" + 
                     "<The robot's eyes turn red>\n" + 
                     "That's because I, Vonticrat the Vengeful, poisoned it and then hacked into this robot!" + 
                     "<Robotic laughter ensues as the robot self-destructs in front of you. After a while, you start getting dizzy and fall, dying.>");
                    gameOver();
                  }
            }
            else if(firstRequest.indexOf("no") >= 0)
            {
               System.out.println("Do you want to go to the door then? Or go down to Room #1?");
               if(firstRequest.indexOf("door") >= 0)
               {
                  System.out.println("Off you go to Room #4 then! Bye! Have a great life! I hope to see you again... you made today less boring, waiting around for someone to come here!");
                  room4.getInfoOnRoom4();
               }
               else if(firstRequest.indexOf("down") >= 0)
               {
                  System.out.println("Off to room #1 you go! Bye! Have as nice of a day as you can!");
                  room1.getInfoOnRoom1();
               }
            }
         }
         else if(firstRequest.indexOf("door") >= 0)
         {
           System.out.println("Off you go to Room #4 then! Bye! Have a great life! I hope to see you again... you made today less boring, waiting around for someone to come here!");
           room4.getInfoOnRoom4();
         }
      }   
      else if(firstRequest.indexOf("down") >= 0)
      {
         System.out.println("Off to room #1 you go! Bye! Have as nice of a day as you can!");
         room1.getInfoOnRoom1();
      }
   }
}