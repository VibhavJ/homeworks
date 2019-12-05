

public class Sort{
    public static void a_Sort(int [] arr){
           
      int n = arr.length;
      int temp = 0;

      for(int i = 0; i < n; i++){
         for(int j=1; j < (n-i); j++){
            if(arr[j-1] > arr[j]) {
               temp = arr[j-1];
               arr[j-1] = arr[j];
               arr[j] = temp;
            }
      
         }
      }
  
   }

 void d_Sort(int [] arr){
           
   int n = arr.length;
      int temp = 0;

      for(int i = 0; i < n; i++){
      for(int j=1; j < (n-i); j++){
       if(arr[j-1] < arr[j]) {
               temp = arr[j-1];
               arr[j-1] = arr[j];
               arr[j] = temp;
            }
      
      }
        }
  
   }
public static void main(String[] args){
int arr[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };

 Sort1 mySort = new Sort();
 
      System.out.println("Array Before Sorting");

      for(int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }

mySort.a_Sort(arr);
       System.out.println();
      System.out.println("Array After ascending order Sorting");
 for(int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");

      }

mySort.d_Sort(arr);
       System.out.println();
      System.out.println("Array After dcending order Sorting");
 for(int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");

      }







}
























}

/******************************************/

/*
public class BubbleSort{
//static void bubbleSort(int[] arr){
 void bubbleSort(int[] arr){
 int n = arr.length;
      int temp = 0;

      for(int i = 0; i < n; i++){
      for(int j=1; j < (n-i); j++){
       if(arr[j-1] > arr[j]) {
               temp = arr[j-1];
               arr[j-1] = arr[j];
               arr[j] = temp;
            }

      
      
      }
      
      }



}
}
//

static void dSort(int[] arr){
 int n = arr.length;
      int temp = 0;

      for(int i = 0; i < n; i++){
      for(int j=1; j < (n-i); j++){
       if(arr[j-1] < arr[j]) {
               temp = arr[j-1];
               arr[j-1] = arr[j];
               arr[j] = temp;
            }

      
      
      }
      
      }



}
 public static void main(String[] args){
 int arr[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
      System.out.println("Array Before Bubble Sort");

      for(int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
  //    dSort(arr);
  dSort.BubbleSort(arr);
       System.out.println();
      System.out.println("Array After Bubble Sort");
 for(int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");

      }

 }

}
*/