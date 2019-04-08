class Task1{
public static void main(String args[]){
String name;
int marks;
float percent;
char grade;
boolean status;

name = "Raja";
marks = 486;
percent = marks*100 / 550f;

if(percent >= 80){
grade = 'A';
status = true;
}else
if(percent >= 70 && percent < 80){
grade = 'B';
status = true;
}else
if(percent >= 60 && percent < 70){
grade = 'C';
status = true;
}else{
grade = 'D';
status = false;
}

System.out.println("Name		  	=  "+name);
System.out.println("Marks out of 550	=  "+marks);
System.out.println("Percentage		=  "+percent);
System.out.println("Grade			=  "+grade);
if(status == true){
System.out.println("Status		  	=  "+"pass");
}else{
System.out.println("Status			=  "+"fail");
}
}
}