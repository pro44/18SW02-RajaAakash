class Task1{
public static void main(String args[]){
String name = "Raja";
int marks = 440;
float percent = marks*100 / 500;
char grade = 'A';
boolean status = false;
System.out.println("Name		  	=  "+name);
System.out.println("Marks out of 500	=  "+marks);
System.out.println("Percentage		=  "+percent);
System.out.println("Grade			=  "+grade);
if(status == true){
System.out.println("Status		  	=  "+"pass");
}else{
System.out.println("Status			=  "+"fail");
}
}
}