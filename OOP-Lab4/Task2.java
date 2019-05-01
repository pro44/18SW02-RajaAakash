import java.util.*;
class Task2{
	public static void main(String args[]) {

      Scanner sc = new Scanner(System.in);
	  
      System.out.println("Enter number :");
      int num = sc.nextInt();
	  
      System.out.println("Enter Starting number :");
	  int start = sc.nextInt();
	  
      System.out.println("Enter Ending number :");
	  int end = sc.nextInt();
      
		for( int i=start;i<=end;i++ ){
			System.out.println(num+" X "+i+" = "+num*i);
		}
	
	
	
	
	}
}