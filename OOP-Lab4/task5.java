import java.util.*;
class Task5{
	public static void main(String args[]) {
 int temp, size;
      int array[] = {1, 8, 3, 2, 6, 4};
      size = array.length;

      for(int i = 0; i<size; i++ ){
         for(int j = i+1; j<size; j++){
            if(array[i]>array[j]){
               temp = array[i];
               array[i] = array[j];
               array[j] = temp;
            }
         }
      }
      System.out.println("largest number is "+array[size-1]);
   }
}