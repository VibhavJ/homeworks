//Vibhav J.
//This is the control for the main inventory system.
//In order to run this, you must run StringRoomControl.java
import java.util.*;
import java.util.ArrayList;

public class StringInventorySystem
{
   public static Room2 room2 = new Room2();
   public static Room3 room3 = new Room3();
   public static Room4 room4 = new Room4();
   public ArrayList<String> mainInventory = new ArrayList<String>();
   public StringInventorySystem() //This allows for the creation of an object of this class to happen in other classes
   {
   
   }
   public void main(String[] args)
   {
      for(int i = 0; i < room2.InventoryOne.size(); i++)
      {
         mainInventory.addAll(room2.InventoryOne);
      }
      for(int i = 0; i < room3.InventoryTwo.size(); i++)
      {
         mainInventory.addAll(room3.InventoryTwo);
      }
      for(int i = 0; i < room4.InventoryThree.size(); i++)
      {
         mainInventory.addAll(room4.InventoryThree);
      }
   }
   void displayArrayList() //This is a method that accesses the array from another class that checks inventory
   {
      System.out.println("Let's see what's in your inventory, shall we? *scans your inventory*");
      System.out.println();
      System.out.println("--------------------------------------------------");
      System.out.println("You have the following items: ");
      for(String str : mainInventory)
      {
        System.out.print("" + str);
      }
      System.out.println();
      System.out.println("--------------------------------------------------");
   }
}