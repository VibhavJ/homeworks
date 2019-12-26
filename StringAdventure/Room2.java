//Vibhav J.
//Room2.java
//In order to run this, you must run StringRoomControl.java
import java.util.*;

public class Room2
{
   public static Room4 room4 = new Room4();
   public static StringInventorySystem strInventorySystem = new StringInventorySystem();
   public String directions[] = {"up", "down", "east", "west", "central", "exit"};
   public String pickUpItems[] = {"disguise", "map", "sword", "bag of cheetos"};
   public String actionWords[] = {"pick up", "put down", "smell", "store", "swing", "run", "keep", "walk", "eat", "put on"};
   public ArrayList<String> InventoryOne = new ArrayList<String>();
   public String firstRequest;
   public int visitCount = 0;
   public String firstRequestAlt = "";
   public Scanner input1 = new Scanner(System.in);
   public Room2() //This allows for the creation of an object of this class to happen in other classes
   {
         
   }
   public void getInfoOnRoom2() //This starts off the adventure in Room #2.
   {
      visitCount++;
      System.out.println("You hve entered #2 of the room of infinite enigmas. Your total visits to this specific room are/is " + visitCount + ". Where do you want to go?\n");
      room2Explorer();
      room2MindMaze();
   }
   public void room2Explorer()
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
      System.out.println("\nIf you want to leave this room type in \"exit\". If you want to continue type \"continue\": ");
      firstRequest = input1.nextLine();
      firstRequest = firstRequest.toLowerCase();
      if(firstRequest.indexOf("exit") >= 0)
      {
         firstRequestAlt = "exit";
         System.out.println("You will now exit the room. Goodbye.\n");
         gameOver();
      } else {
         System.out.println("You did not type exit so it looks like you are stuck in my mind maze for a while *laughs evilly*\n");
      }

   }
   void gameOver()
   {
      System.out.println("gameOver() called.\n");
      StringRoomControl.programExit();
      return;
   }
   public void room2MindMaze()
   {
      String tempAnswer = "";
      System.out.println("The central room you are standing in the reeks of some horrible smell\n" + 
         " that reminds you of an uncomfortable situation while in Clown College. However, you" +
         " do not recognize the room. All you can see are stairs that go up and a door on the east side of the room.\n" +
         "A sense of fear is overwhelming your mind, it is becoming very hard to breath. You must escape immediately!\n" +
         "Where do you want to go?\n");
      firstRequest = input1.nextLine();
      firstRequest = firstRequest.toLowerCase();
      for(int i = 0; i <= directions.length; i++)
      {
         if(firstRequest.indexOf(directions[i]) >= 0)
         {
            tempAnswer = directions[i];
            break;
         }
      }
      if(tempAnswer.equals("exit"))
      {
         System.out.println("I'm sorry... there is no exit. While you were wasting time with the exit, a group of clowns \n" +
            "came to the house and dragged you off to the circus to wash their clown shoes.\n");
         System.out.println("This seems like a pretty good time to end the game...\n"); 
           
      }
      else if(tempAnswer.equals("up"))
      {
         room2UpStairsCentral();
      }
      else if(tempAnswer.equals("east"))
      {
         room2EastRoom();
      }
   }
   void room2UpStairsCentral()
   {
      System.out.println("Good idea! You ran upstairs and there's a door. Want to open it or go back downstairs?");
      firstRequest = input1.nextLine();
      firstRequest = firstRequest.toLowerCase();
      if(firstRequest.indexOf("open") >= 0)
      {
         System.out.println("Now go! Quickly before something comes!");
         room4.getInfoOnRoom4();
      }
      else if(firstRequest.indexOf("down") >= 0)
      {
         System.out.println("You went back downstairs and try exitting only to be trapped in the mind maze! MWHAHAHAHAHHAA!");
         room2MindMaze();
      }
   }
   void room2EastRoom()
   {
   	String tempAnswer = "";
	   String tempAnswer2 = "";
	   System.out.println("You walk through eastern door: There is a bag full of clown noses and a disguise. There’s a creaking sound\n" + 
         " coming from the ceiling. A faint giggle can be heard. The door behind you slams and locks. \n" + 
         "You see a set of stairs that go down.\n You have two good options: Do you want to go down the stairs or pick up the disguise?\n");
	   firstRequest = input1.nextLine();
	   firstRequest = firstRequest.toLowerCase();
	   for(int i = 0; i <= directions.length - 1; i++)
      {
	      if(firstRequest.indexOf(directions[i]) >= 0)
         {
            tempAnswer = directions[i];
      	   break;
         }
      }
      if(tempAnswer.equals("exit"))  
      {
	   	System.out.println("So sad... the exit disappeared with clown magic. You are now trapped forever in the 	clown nightmare.\n");
	   	gameOver();
      }
      else if(tempAnswer.equals("down"))
      {
      	room2DownStairs();
      }
      else{
      	for(int i = 0; i <= actionWords.length - 1; i++)
         {
	         if(firstRequest.indexOf(actionWords[i]) >= 0)
	         {
	            tempAnswer = actionWords[i];
	            if(tempAnswer.equals("pick up"))
	            {
	            	tempAnswer = actionWords[i];
	            	break;
               }
            }
         }
         for(int i = 0; i <= pickUpItems.length - 1; i++)
         {
	         if(firstRequest.indexOf(pickUpItems[i]) >= 0)
	         {
	         	tempAnswer2 = pickUpItems[i];
	         	if(tempAnswer2.equals("disguise"))
	         	{
	         		tempAnswer2 = pickUpItems[i];
	         		if(tempAnswer.equals("pick up"))
	         		{
	                  break;
                  }        
               }  
            }
         }
      }
      if(tempAnswer.equals("pick up") && tempAnswer2.equals("disguise"))
      {
      	System.out.println("Do you want to store the disguise or put it on?\n");
       	firstRequest = input1.nextLine();
	      firstRequest = firstRequest.toLowerCase();
	      if(firstRequest.indexOf("store") >= 0)
	      {
	         System.out.println("You stored the disguise.\n");
	         room2StoreItem(tempAnswer2);
	         System.out.println("After storing the disguise, there is little time so you hurry down the stairs");
            room2DownStairs();
         }
         else if(firstRequest.indexOf("put on") >= 0)
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
            if(room4.isWearing.size() <= 1)
            {
               System.out.println("You put on the disguise");
         	   room2PutOnTheDisguise();
            } else{
               System.out.println("You are already wearing something. Do you want to take it off?");
               firstRequest = input1.nextLine();
	            firstRequest = firstRequest.toLowerCase();
	            if(firstRequest.indexOf("yes") >= 0)
	            {
                 System.out.println("You take them off.");
                 for(int i = 0; i < room4.isWearing.size(); i++)
                 {
                     room4.isWearing.remove(i + 1);
                 }
               } else{
                  System.out.println("Then, you can't put it on the disguise. The only way is downstairs then...");
                  room2DownStairs();
               }
            }
         }
         else{
            System.out.println("You did not pick one of the correct choices or you misspelled a word.\n" + "Either way we are going to force you to make this decision.");
         }
      }
   }
   void room2DownStairs()
   {
      System.out.println("You run downstairs only to find a cult meeting occuring with all of the clowns that had taken you here. You quickly put on the disguise.");
      room2PutOnTheDisguise();
      System.out.println();
      System.out.println("Do you want to go down there or back to the room?");
      firstRequest = input1.nextLine();
	   firstRequest = firstRequest.toLowerCase();
	   if(firstRequest.indexOf("down") >= 0)
      {
         System.out.println("You go down there and they immediately recognize that you are a fake as all of the cult members were present before you came and so they used you to appease the Great Clown as a sacrifice.");
         gameOver();
      }
      else if(firstRequest.indexOf("back") >= 0)
      {
         System.out.println("You go back up and the faint giggle becomes louder and louder until you look up and notice a skeletal creature on the ceiling that jumps on you and kills you.");
         gameOver();
      }
   }
   void room2PutOnTheDisguise()
   {
      room4.isWearing.add("disguise");
      System.out.println("Congrats! You successfully put on the disguise!");
   }
   void room2StoreItem(String s)
   {
      InventoryOne.add(s);
      strInventorySystem.displayArrayList(); //This is a method that accesses the array from another class that checks inventory
   }
}
