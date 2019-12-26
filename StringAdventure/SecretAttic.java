//Vibhav J.
//This is the control for Secret Attic.
//In order to run this, you must run StringRoomControl.java
import java.util.*;

public class SecretAttic
{
   public static Room4 room4 = new Room4();
   public static Room3 room3 = new Room3();
   public static StringInventorySystem strInventorySystem = new StringInventorySystem();
   public String firstRequest;
   public int visitCount = 0;
   public String firstRequestAlt = "";
   public Scanner input1 = new Scanner(System.in);
   public SecretAttic() //This allows for the creation of an object of this class to happen in other classes
   {
         
   }
   public void getInfoOnSecretAttic() //This is the start of the Secret Attic Scene.
   {
      visitCount++;
      System.out.println("You hve entered <tHe SeCrEt RoOm> of the room of infinite enigmas. Your total visits to this specific room are/is " + visitCount);
      System.out.println("Are you wearing anything other than your clothes? Let's check! *scans you*"); //This uses an array from another class that stores what the character is wearing
      System.out.println();
      System.out.println("--------------------------------------------------");
      System.out.println("You are wearing the following items: ");
      for(String str : room4.isWearing)
      {
        System.out.print("" + str);
      }
      System.out.println();
      System.out.println("--------------------------------------------------");
      strInventorySystem.displayArrayList(); //This is a method that accesses the array from another class that checks inventory
      start();
   }
   public void start()
   {
      System.out.println("Well well well... someone finally solved that riddle. Say, is anyone even around here anymore? Anyways, what's your name?");
      firstRequest = input1.nextLine();
      System.out.println("So, " + firstRequest + ", Is there any reason for your arrival?");
      firstRequest = input1.nextLine();
      firstRequest = firstRequest.toLowerCase();
      if(firstRequest.indexOf("no") >= 0)
      {
         System.out.println("THEN WHY ARE YOU WASTING MY TIME?! <The creature whose voice you conversed with jumps at you and eats you alive.>");
         gameOver();
      }
      else if(firstRequest.indexOf("yes") >= 0)
      {
         System.out.println("Why, how wonderful! What is it, if you don't mind me asking?");
         firstRequest = input1.nextLine();
         System.out.println(firstRequest + " is it? Well, first, I want to know more about you. Tell me what rooms you've gone to so far!");
         firstRequest = input1.nextLine();
         firstRequest = firstRequest.toLowerCase();
         if(firstRequest.indexOf("1") >= 0)
         {
            System.out.println("Aah, the room with the dog-eating chicken and chicken-eating dogs! It was my fun little addition to the room. Did you like that?");
            firstRequest = input1.nextLine();
            firstRequest = firstRequest.toLowerCase();
            if(firstRequest.indexOf("yes") >= 0)
            {
               System.out.println("That's great! Any other rooms you went to?");
               firstRequest = input1.nextLine();
               firstRequest = firstRequest.toLowerCase();
               if(firstRequest.indexOf("2") >= 0)
               {
                  System.out.println("Aah, the mind maze! I'm surprised you survived that. Impressive... So, want to try something?");
                  firstRequest = input1.nextLine();
                  firstRequest = firstRequest.toLowerCase();
                  if(firstRequest.indexOf("yes") >= 0)
                  {
                     System.out.println("Wonderful! Then, let's see if you'll still live after this! MWHAHAHHA! <The hooded creature shoots electricity at you, practically frying your body.>");
                     gameOver();
                  }
                  else if(firstRequest.indexOf("no") >= 0)
                  {
                     System.out.println("THEN WHY ARE YOU WASTING MY TIME?! <The creature whose voice you conversed with jumps at you and eats you alive.>");
                     gameOver();
                  }
               }  
               else if(firstRequest.indexOf("3") >= 0)
               {
                  System.out.println("One of the rooms on the upper level correct? Say... is my magic staff still there? I had to leave hastily as some new residents decided to take it over. *scowls*");
                  firstRequest = input1.nextLine();
                  firstRequest = firstRequest.toLowerCase();
                  if(firstRequest.indexOf("yes") >= 0)
                  {
                     System.out.println("Oh wonderful! Would you mind being a kind person and bring those back to me?");
                     firstRequest = input1.nextLine();
                     firstRequest = firstRequest.toLowerCase();
                     if(firstRequest.indexOf("yes") >= 0)
                     {
                        System.out.println("Oh thank you so very very much! <The creature opens a portal to Room #3 to help you get there without trouble, knowing you won't make it back.>");
                        room3.getInfoOnRoom3();
                     }
                     else if(firstRequest.indexOf("no") >= 0)
                     {
                        System.out.println("I tried being nice, didn't I? Well, it's time I become serious then... you will be helping me get those back regardless of your opinions.\n" + 
                           "<The creature opens a portal to Room #3 and sends a large gust of wind towards you, pushing you into the portal.>");
                        room3.getInfoOnRoom3();
                     }
                  }     
                  else if(firstRequest.indexOf("no") >= 0)
                  {
                     System.out.println("Let me see in my vision... <A bright eye shape glows a bright yellow> Well well... you lied to me!\n" + 
                        "Tsk tsk... you should never play games with the Great Clown, did they never tell you?\n" +
                        "<The creature whose voice you conversed with jumps at you and eats you alive.>");
                     gameOver();
                  }     
               }
               else if(firstRequest.indexOf("4") >= 0)
               {
                  System.out.println("Of course you did! That's where you came from silly! Say, are you still in the mood for riddles?");
                  firstRequest = input1.nextLine();
                  firstRequest = firstRequest.toLowerCase();
                  if(firstRequest.indexOf("yes") >= 0)
                 {
                    System.out.println("Let's add a twist, shall we? Answer my 3 riddles correctly and I will let you leave this place completely...\n" + 
                       "but get even one wrong and you shall be locked up in eternal darkness as my prisoner! Let's start now!");
                    System.out.println();
                    System.out.println("Riddle #1: I have keys but no locks. I have a space but no room. You can enter, but can’t go outside. What am I?");
                    firstRequest = input1.nextLine();
                    firstRequest = firstRequest.toLowerCase();
                    if(firstRequest.indexOf("keyboard") >= 0)
                    {
                      System.out.println("Congratulations! 1 down, 2 to go...");
                      System.out.println();
                      System.out.println("Riddle #2: I can only live where there is light, but I die if the light shines on me. What am I?");
                      firstRequest = input1.nextLine();
                      firstRequest = firstRequest.toLowerCase();
                      if(firstRequest.indexOf("shadow") >= 0)
                      { 
                        System.out.println("Congratulations! 2 down, 1 to go...");
                        System.out.println();
                        System.out.println("Riddle #3: If all Wickers are Ribblers, all Borkins are Kwumblins, no Broggles are Borkins, and all Ribblers are Borkins, is it true that all Borkins are Ribblers?");
                        firstRequest = input1.nextLine();
                        firstRequest = firstRequest.toLowerCase();
                        if(firstRequest.indexOf("no") >= 0)
                        {
                           System.out.println("Congratulations! You suurpassed my riddles! Now, as I promised, I shall set you free! *snaps fingers*");
                           secretSomewhatGoodEnding();
                        } else{
                           System.out.println("You were doing so well... it was the final one! Oh well... a promise is a promise! MWHAHAHAHAH");
                           secretAtticPrison();
                        }
                      } else{
                        System.out.println("You were doing so well... almost halfway done. Oh well... a promise is a promise! MWHAHAHAHAH");
                        secretAtticPrison();
                      }  
                  } else{
                     System.out.println("You already failed, huh? Tsk tsk...");
                     secretAtticPrison();
                  }
               }  
            }
          }
          else if(firstRequest.indexOf("no") >= 0)
          {
            System.out.println("THEN WHY ARE YOU WASTING MY TIME?! <The creature whose voice you conversed with jumps at you and eats you alive.>");
            gameOver();
          }
         }
         else if(firstRequest.indexOf("2") >= 0)
         {
            System.out.println("Aah, the mind maze! I'm surprised you survived that. Impressive... So, want to try something?");
            firstRequest = input1.nextLine();
            firstRequest = firstRequest.toLowerCase();
            if(firstRequest.indexOf("yes") >= 0)
            {
               System.out.println("Wonderful! Then, let's see if you'll still live after this! MWHAHAHHA! <The hooded creature shoots electricity at you, practically frying your body.>");
               gameOver();
            }
            else if(firstRequest.indexOf("no") >= 0)
            {
               System.out.println("THEN WHY ARE YOU WASTING MY TIME?! <The creature whose voice you conversed with jumps at you and eats you alive.>");
               gameOver();
            }
         }
         else if(firstRequest.indexOf("3") >= 0)
         {
            System.out.println("One of the rooms on the upper level correct? Say... is my magic staff still there? I had to leave hastily as some new residents decided to take it over. *scowls*");
            firstRequest = input1.nextLine();
            firstRequest = firstRequest.toLowerCase();
            if(firstRequest.indexOf("yes") >= 0)
            {
               System.out.println("Oh wonderful! Would you mind being a kind person and bring those back to me?");
               firstRequest = input1.nextLine();
               firstRequest = firstRequest.toLowerCase();
               if(firstRequest.indexOf("yes") >= 0)
               {
                  System.out.println("Oh thank you so very very much! <The creature opens a portal to Room #3 to help you get there without trouble, knowing you won't make it back.>");
                  room3.getInfoOnRoom3();
               }
               else if(firstRequest.indexOf("no") >= 0)
               {
                  System.out.println("I tried being nice, didn't I? Well, it's time I become serious then... you will be helping me get those back regardless of your opinions.\n" + 
                     "<The creature opens a portal to Room #3 and sends a large gust of wind towards you, pushing you into the portal.>");
                  room3.getInfoOnRoom3();
               }
            }
            else if(firstRequest.indexOf("no") >= 0)
            {
               System.out.println("Let me see in my vision... <A bright eye shape glows a bright yellow> Well well... you lied to me!\n" + 
                  "Tsk tsk... you should never play games with the Great Clown, did they never tell you?\n" +
                  "<The creature whose voice you conversed with jumps at you and eats you alive.>");
               gameOver();
            }
         }
         else if(firstRequest.indexOf("4") >= 0)
         {
            System.out.println("Of course you did! That's where you came from silly! Say, are you still in the mood for riddles?");
            firstRequest = input1.nextLine();
            firstRequest = firstRequest.toLowerCase();
            if(firstRequest.indexOf("yes") >= 0)
            {
               System.out.println("Let's add a twist, shall we? Answer my 3 riddles correctly and I will let you leave this place completely...\n" + 
                  "but get even one wrong and you shall be locked up in eternal darkness as my prisoner! Let's start now!");
               System.out.println();
               System.out.println("Riddle #1: I have keys but no locks. I have a space but no room. You can enter, but can’t go outside. What am I?");
               firstRequest = input1.nextLine();
               firstRequest = firstRequest.toLowerCase();
               if(firstRequest.indexOf("keyboard") >= 0)
               {
                  System.out.println("Congratulations! 1 down, 2 to go...");
                  System.out.println();
                  System.out.println("Riddle #2: I can only live where there is light, but I die if the light shines on me. What am I?");
                  firstRequest = input1.nextLine();
                  firstRequest = firstRequest.toLowerCase();
                  if(firstRequest.indexOf("shadow") >= 0)
                  {
                     System.out.println("Congratulations! 2 down, 1 to go...");
                     System.out.println();
                     System.out.println("Riddle #3: If all Wickers are Ribblers, all Borkins are Kwumblins, no Broggles are Borkins, and all Ribblers are Borkins, is it true that all Borkins are Ribblers?");
                     firstRequest = input1.nextLine();
                     firstRequest = firstRequest.toLowerCase();
                     if(firstRequest.indexOf("no") >= 0)
                     {
                        System.out.println("Congratulations! You suurpassed my riddles! Now, as I promised, I shall set you free! *snaps fingers*");
                        secretSomewhatGoodEnding();
                     } else{
                        System.out.println("You were doing so well... it was the final one! Oh well... a promise is a promise! MWHAHAHAHAH");
                        secretAtticPrison();
                     }
                  } else{
                     System.out.println("You were doing so well... almost halfway done. Oh well... a promise is a promise! MWHAHAHAHAH");
                     secretAtticPrison();
                  }
               } else{
                  System.out.println("You already failed, huh? Tsk tsk...");
                  secretAtticPrison();
               }
            }
         }
      }
   }
   void gameOver()
   {
      System.out.println("gameOver() called.\n");
      StringRoomControl.programExit();
      return;
   }
   void secretAtticPrison()
   {
      System.out.println("<The hooded creature moves from the darkness to show you his face> Take a good look because this is the last face you. will. ever. see. MWHAHAHAAHA! *claps his hands thrice*\n" + 
         "<You open your eyes to complete darkness... you try to find out if anyone else is there but, in the end, it's only you there, now and forever. Game. Over.>");
      gameOver();
   }
   void secretSomewhatGoodEnding()
   {
      System.out.println("You wake up in a field of light purple grass and you stand up in it. You suddenly look at the sun and its light fills your vision as you...\n" + 
         "...\n" +
         "...\n" +
         "...\n" +
         "wake up in your bed with the blinds open, allowing light to fill your vision as your eyes open... you realize it's time for you to get ready for the day and think back on the interesting events that occurred in your slumber... but what if it was never a dream...\n" +
         "what if...\n" + 
         "what if it was a peek into the future?! DUN DUN DUUUU!");
      System.out.println();
      System.out.println("Thank you so much for playing this text-based adventure and I hope you liked it very much!");
   }
}