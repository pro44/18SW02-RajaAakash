import java.util.*;
class VorC{
	public static void main(String args[]) {
      boolean bool = false;
      System.out.println("Enter a character :");
      Scanner sc = new Scanner(System.in);
      char ch = sc.next().charAt(0);
      switch(ch) {
         case 'A' :{
			 bool = true;
			 break;
		 }
         case 'E' :{
			 bool = true;
			 break;
		 }
         case 'I' :{
			 bool = true;
			 break;
		 }
         case 'O' :{
			 bool = true;
			 break;
		 }
         case 'U' :{
			 bool = true;
			 break;
		 }
         case 'a' :{
			 bool = true;
			 break;
		 }
         case 'e' :{
			 bool = true;
			 break;
		 }
         case 'i' :{
			 bool = true;
			 break;
		 }
         case 'o' :{
			 bool = true;
			 break;
		 }
         case 'u' :{
			 bool = true;
			 break;
		 }
      }
      if(bool == true){
         System.out.println("Given character is an vowel ");
      }else{
         System.out.println("Given character is a consonant ");
      }
   }
}