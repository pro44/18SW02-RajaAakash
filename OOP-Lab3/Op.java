import java.util.*;
class Op{
public static void main(String args[]){
	
    Scanner sc = new Scanner(System.in);
	  System.out.println("Enter 1st Number :");
      int num1 = sc.nextInt();
	  System.out.println("Enter 2nd Number :");
      int num2 = sc.nextInt();  
	  System.out.println("Enter Operator :");
      int operator = sc.next().charAt(0);  

		double addition  = num1+num2;
        double subtraction  = num1-num2;
        double multiplication  = num1*num2;
        double division  = num1/num2;

        switch(operator)
        {
            case '+' :
            {
                System.out.print("Result after Addition is : "+addition);
                break;
            }
            case '-' :
            {
                System.out.print("Result after Subtraction is : " +subtraction);
                break;
            }
            case '*' :
            {
                System.out.print("Result after Multiplication is : "+multiplication);
                break;
            }
            case '/' :
            {
                System.out.print("Result after Division is : "+division);
                break;
            }
            default :
            {
                System.out.print("Please select proper operator");
                return;
            }

}
}
}