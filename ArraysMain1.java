//ArraysMain.java
//Vibhav J.
import java.util.Scanner;
import java.util.Arrays;
public class ArraysMain1
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      Scanner c = new Scanner(System.in);
      Scanner a = new Scanner(System.in);
      Scanner n = new Scanner(System.in);
      Scanner p = new Scanner(System.in);
      
      System.out.println("What is the maximum number of slots you want the array to hold?"); //sets up the array
      int numSpaces = s.nextInt();
      int[] arrayOne = new int[numSpaces];
      int [] dumarry = new int [2];
      for(int x = 0; x < arrayOne.length; x++)//helps with value adding for the array
      {
         System.out.println("What number would you like to put in the number " + x + " slot?");
         int userNumChoice = c.nextInt();
         arrayOne[x] = userNumChoice;
      }
      System.out.println("The entered numbers are ");     
      for(int x = 0; x < arrayOne.length; x++)//prints the original array
      {
         System.out.print(arrayOne[x]+" ");
      }
      System.out.println();
      System.out.println("if you want sorting in ascending order enter char a for desending d");
      Scanner scanner = new Scanner(System.in);
      char mans = scanner.next().charAt(0);//gets input of which order should be displayed
      if (mans=='a'){
         System.out.println("Array After ascending order Sorting");
         sortMethods.a_Sort(arrayOne);
         for(int i = 0; i <arrayOne.length; i++) 
         {
           System.out.print(arrayOne[i] + " ");
         }
         System.out.println();
         sortMethods.a_largestnum(arrayOne, dumarry);
         System.out.println("THE largest number is " + dumarry[0]);
         System.out.println("THE second largest number is " +dumarry[1]);
      }else{
         System.out.println("Array After descending order Sorting");
         sortMethods.d_Sort(arrayOne);
         for(int i = 0; i < arrayOne.length; i++) 
         {
            System.out.print(arrayOne[i] + " ");
         }
         System.out.println();
         sortMethods.d_largestnum(arrayOne, dumarry);
         System.out.println("THE largest number is " + dumarry[0]);
         System.out.println("THE second largest number is " +dumarry[1]);      }
      }
   }
class sortMethods
{
   public static void d_Sort(int [] arrayOne)
   {        
      int n = arrayOne.length;
      int temp = 0;
      for(int i = 0; i < n; i++){
         for(int j=1; j < (n-i); j++){
            if(arrayOne[j-1] < arrayOne[j]) { //sorts the array from highest to lowest
               temp = arrayOne[j-1];
               arrayOne[j-1] = arrayOne[j];
               arrayOne[j] = temp;
            }
         }
      }
   }     
//**************************************************/
    
//**************************************************/
   public static void  a_Sort(int [] arrayOne){           
      int n = arrayOne.length;
      int temp = 0;
      for(int i = 0; i < n; i++){
         for(int j=1; j < (n-i); j++){
            if(arrayOne[j-1] > arrayOne[j]){ //sorts the array from lowest to highest
               temp = arrayOne[j-1];
               arrayOne[j-1] = arrayOne[j];
               arrayOne[j] = temp;
            }
         }
      } 
   }

//*********
   public static void  a_largestnum(int [] arrayOne, int [] dumarry){          
      int n = arrayOne.length-1;
      dumarry[0]=arrayOne[n];
      dumarry[1]=arrayOne[n-1];
      int temp =arrayOne[n] ;
      for(int i = n; i > 0; i--){
         for(int j=i; j >0; j--){
            if(arrayOne[j-1] !=temp) {//shows the largest number in ascending order
               j=0;
               i=0;             
            }else{
               temp = arrayOne[j-1];
               dumarry[1] = arrayOne[j-2];
            }     
         }
      }
   }
//***********    
//*********
   public static void  d_largestnum(int [] arrayOne, int [] dumarry){           
      int n = arrayOne.length-1;
      dumarry[0]=arrayOne[0];
      dumarry[1]=arrayOne[1];
      int temp =arrayOne[0];
      for(int i = 0; i <n; i++){
         for(int j=i+1; j <n; j++){
            if(arrayOne[j] !=temp){ //shows the largest number in descending order
               j=n;
               i=n;              
            }else{
               temp = arrayOne[j];
               dumarry[1] = arrayOne[j+1];
            }     
         }
      }
   }
}