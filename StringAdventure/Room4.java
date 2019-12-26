//Vibhav J.
//This is the control for Room #4.
//In order to run this, you must run StringRoomControl.java
import java.util.*;

public class Room4
{
   public static Room2 room2 = new Room2();
   public static StringInventorySystem strInventorySystem = new StringInventorySystem();
   public static SecretAttic secretAttic = new SecretAttic();
   public String directions[] = {"left", "right", "back"};
   public String pickUpItems[] = {"mysterious box", "orb", "cloak"};
   public String actionWords[] = {"pick up", "put down", "smell", "store", "swing", "run", "keep", "walk", "eat", "put on"};
   public ArrayList<String> InventoryThree = new ArrayList<String>();
   public ArrayList <String>isWearing = new ArrayList<String>();
   public String firstRequest;
   public int visitCount = 0;
   public String firstRequestAlt = "";
   public Scanner input1 = new Scanner(System.in);
   public Room4() //This allows for the creation of an object of this class to happen in other classes
   {
         
   }
   public void getInfoOnRoom4() //This is the start of the adventure in this room.
   {
      visitCount++;
      System.out.println("You hve entered #4 of the room of infinite enigmas. Your total visits to this specific room are/is " + visitCount + ". Where do you want to go?\n");
      room4Explorer();
   }
   public void room4Explorer()
   {
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
      System.out.println("\nIf you want to leave this room type in \"down\" to go down t Room #2. If you do not want to leave, type in \"stay\".");
      firstRequest = input1.nextLine();
      firstRequest = firstRequest.toLowerCase();
      if(firstRequest.indexOf("exit") >= 0)
      {
         firstRequestAlt = "exit";
         System.out.println("You will now exit the room. Goodbye.\n");
         gameOver();
      }
      else if(firstRequest.indexOf("stay") >= 0){
         System.out.println("I'm glad you decided to stay!");
         room4Continue();
      }
   }
   void gameOver()
   {
      System.out.println("gameOver() called.\n");
      StringRoomControl.programExit();
      return;
   }
   public void room4Continue()
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
         System.out.println("To the left, there is a mysterious box, a orb, and a cloak. Which one has intrigued you the most?");
         firstRequest = input1.nextLine();
         firstRequest = firstRequest.toLowerCase();
         if(firstRequest.indexOf("box") >= 0)
         {
            System.out.println("You walk up to the box and open it, releasing a large cloud of deadly wasps that attack you, thus killing you. Oh well...");
            gameOver();
         }
         else if(firstRequest.indexOf("orb") >= 0)
         {
            System.out.println("You walk up to the orb and rub it. The clear orb becomes darker and darker until a giant force of wind pushes you to the other side of the room.\n" + 
               "The darkened orb rolls over and breaks releasing a demon into the room. The demon approaches you and sucks your soul out of you.");
            gameOver();
         }
         else if(firstRequest.indexOf("cloak") >= 0)
         {
            System.out.println("You walk up to the cloak and pick it up. Do you want to put it on?");
            firstRequest = input1.nextLine();
            firstRequest = firstRequest.toLowerCase();
            if(firstRequest.indexOf("yes") >= 0)
            {
               System.out.println("Are you wearing anything other than your clothes? Let's check! *scans you*"); //This uses an array from another class that stores what the character is wearing.
               System.out.println();
               System.out.println("--------------------------------------------------");
               System.out.println("You are wearing the following items: ");
               for(String str : isWearing)
               {
                   System.out.print("" + str);
               }
               System.out.println();
               System.out.println("--------------------------------------------------");
               if(isWearing.size() <= 1)
               {
                  System.out.println("You have put it on!");
                  isWearing.add("cloak");
               } else{
                  System.out.println("You are already wearing something. Do you want to take it off?");
                  firstRequest = input1.nextLine();
	               firstRequest = firstRequest.toLowerCase();
	               if(firstRequest.indexOf("yes") >= 0)
	               {
                    System.out.println("You take them off.");
                    for(int i = 0; i < isWearing.size(); i++)
                    {
                        isWearing.remove(i + 1);
                    }
                  }
               }
               System.out.println("Now, do you want to go to the right side of the room, go back, interact with the mysterious box, or interact with the orb?");
               firstRequest = input1.nextLine();
               firstRequest = firstRequest.toLowerCase();
               if(firstRequest.indexOf("right") >= 0)
               {
                  System.out.println("On the right side of the room, there is a small door in a corner. Would you like to go to it?");
                  firstRequest = input1.nextLine();
                  firstRequest = firstRequest.toLowerCase();
                  if(firstRequest.indexOf("yes") >= 0)
                  {
                     System.out.println("There is a riddle inscribed in the door, it states: \"You are my brother, but I am not your brother. Then, what am I?\"\n" + 
                        "You think you can solve it? Gve it a try!");
                     firstRequest = input1.nextLine();
                     firstRequest = firstRequest.toLowerCase();
                     if(firstRequest.indexOf("sister") >= 0)
                     {
                        System.out.println("You did it! The door opened and you are now going in it.");
                        secretAttic.getInfoOnSecretAttic();
                     }
                     else{
                        System.out.println("Oh no! You got it wrong and the room crumbles on top of you, crushing you.");
                        gameOver();
                     }
                  }
                  else if(firstRequest.indexOf("no") >= 0)
                  {
                     System.out.println("Then, off you go back down the stairs!");
                     room2.getInfoOnRoom2();
                  }
               }
               else if(firstRequest.indexOf("back") >= 0)
               {
                  System.out.println("Then, off you go back down the stairs!");
                  room2.getInfoOnRoom2();
               }
               else if(firstRequest.indexOf("box") >= 0)
               {
                  System.out.println("You walk up to the box and open it, releasing a large cloud of deadly wasps that attack you, thus killing you. Oh well...");
                  gameOver();
               }
               else if(firstRequest.indexOf("orb") >= 0)
               {
                 System.out.println("You walk up to the orb and rub it. The clear orb becomes darker and darker until a giant force of wind pushes you to the other side of the room.\n" + 
                    "The darkened orb rolls over and breaks releasing a demon into the room. The demon approaches you and sucks your soul out of you.");
                 gameOver();
               }
            }
            if(firstRequest.indexOf("no") >= 0)
            {
               System.out.println("You decided not to put it on.\n" + 
                  "Now, do you want to go to the right side of the room, go back, interact with the mysterious box, or interact with the orb?");
               firstRequest = input1.nextLine();
               firstRequest = firstRequest.toLowerCase();
               if(firstRequest.indexOf("right") >= 0)
               {
                  System.out.println("On the right side of the room, there is a small door in a corner. Would you like to go to it?");
                  firstRequest = input1.nextLine();
                  firstRequest = firstRequest.toLowerCase();
                  if(firstRequest.indexOf("yes") >= 0)
                  {
                     System.out.println("There is a riddle inscribed in the door, it states: \"You are my brother, but I am not your brother. Then, what am I?\"\n" + 
                        "You think you can solve it? Gve it a try!");
                     firstRequest = input1.nextLine();
                     firstRequest = firstRequest.toLowerCase();
                     if(firstRequest.indexOf("sister") >= 0)
                     {
                        System.out.println("You did it! The door opened and you are now going in it.");
                        secretAttic.getInfoOnSecretAttic();
                     }
                     else{
                        System.out.println("Oh no! You got it wrong and the room crumbles on top of you, crushing you.");
                        gameOver();
                     }
                  }
                  else if(firstRequest.indexOf("no") >= 0)
                  {
                     System.out.println("Then, off you go back down the stairs!");
                     room2.getInfoOnRoom2();
                  }
               }
               else if(firstRequest.indexOf("back") >= 0)
               {
                  System.out.println("Then, off you go back down the stairs!");
                  room2.getInfoOnRoom2();
               }
               else if(firstRequest.indexOf("box") >= 0)
               {
                  System.out.println("You walk up to the box and open it, releasing a large cloud of deadly wasps that attack you, thus killing you. Oh well...");
                  gameOver();
               }
               else if(firstRequest.indexOf("orb") >= 0)
               {
                 System.out.println("You walk up to the orb and rub it. The clear orb becomes darker and darker until a giant force of wind pushes you to the other side of the room.\n" + 
                    "The darkened orb rolls over and breaks releasing a demon into the room. The demon approaches you and sucks your soul out of you.");
                 gameOver();
               }
            }
         }
      }
      else if(firstRequest.indexOf("right") >= 0)
      {
         System.out.println("On the right side of the room, there is a small door in a corner. Would you like to go to it?");
         firstRequest = input1.nextLine();
         firstRequest = firstRequest.toLowerCase();
         if(firstRequest.indexOf("yes") >= 0)
         {
          System.out.println("There is a riddle inscribed in the door, it states: \"You are my brother, but I am not your brother. Then, what am I?\"\n" + 
            "You think you can solve it? Gve it a try!");
          firstRequest = input1.nextLine();
          firstRequest = firstRequest.toLowerCase();
          if(firstRequest.indexOf("sister") >= 0)
          {
            System.out.println("You did it! The door opened and you are now going in it.");
            secretAttic.getInfoOnSecretAttic();
          }
          else{
            System.out.println("Oh no! You got it wrong and the room crumbles on top of you, crushing you.");
            gameOver();
          }
      }
      else if(firstRequest.indexOf("back") >= 0)
      {
         System.out.println("Then, off you go back down the stairs!");
         room2.getInfoOnRoom2();
      }
   }
  }
}