import java.util.Scanner;
class Task2{
	public static void main(String args[]){
		Scanner scanf=new Scanner(System.in);
		System.out.println("Enter Size of an Array");
		int size=scanf.nextInt();
		Test t1=new Test(size);
		t1.populateArray();
		t1.showDetails();
	}
}
class Test{
	int size;
	int arr[];
	Test(int size){
		this.size=size;
		arr=new int[size];
	}
	void populateArray(){
		Scanner scanf=new Scanner(System.in);
		System.out.println("Enter Elements of an Array:");
		for(int i=0;i<size;i++){
			arr[i]=scanf.nextInt();
		}
	}
	void showDetails(){
		System.out.print("Even:");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0)
				System.out.print(arr[i]+" ");
		}
		System.out.print("Odd:");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0)
				System.out.print(arr[i]+" ");
		}
	}
}