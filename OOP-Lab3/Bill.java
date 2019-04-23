import java.util.*;
class Bill{
	public static void main(String args[]){
long units;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter number of units");
           units=sc.nextLong();
     	   double billpay=0;
 
         //calculate
if(units>=0 && units<=50){
billpay=units*10;
}else
if(units>50 && units<=100){
billpay=((units-50)*15)+500;
}else
if(units>100 && units<=200){
billpay=((units-100)*20)+500+50*15;
}else
if(units>200 && units<=300){
billpay=((units-200)*25)+500+50*15+100*20;
}else
if(units>300 && units<=500){
billpay=((units-300)*30)+500+50*15+100*20+200*25;
}
              System.out.println("Bill to pay : " + billpay); 
   } 
}