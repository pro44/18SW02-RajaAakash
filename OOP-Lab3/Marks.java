import java.util.*;
class Marks{
public static void main(String args[]){
	
    Scanner sc = new Scanner(System.in);
	  System.out.println("Enter C++ Marks :");
      int m1 = sc.nextInt();
	  System.out.println("Enter Data Structures Marks :");
      int m2 = sc.nextInt();  
	  System.out.println("Enter OS Marks :");
      int m3 = sc.nextInt();  
	
	int total = m1+m2+m3;
	String grade="";
	
	float percent = (float)total/300*100;

	if( percent>=90 ){
		grade = "A";
	}else
	if( percent>=80 && percent<90 ){
		grade = "B";
	}else
	if( percent>=70 && percent<80 ){
		grade = "C";
	}else
	if( percent>=60 && percent<70 ){
		grade = "D";
	}else
	if( percent<60){
		grade = "FAIL";
	}
	
	
	System.out.println("Percentage = "+percent+" Grade = "+grade);	
	
}
}