class Student
{
		String name,address;
		int age;

	Student(){
		this.name = "unknown";
		this.address = "not availabe";
		this.age =0;
	}
public void setInfo(String name, String address){
			this.name = name;
			this.address = address;
		}

		public void setInfo(String name, String address, int age){
			this.name = name;
			this.address = address;
			this.age = age;
		}
		public void getInfo(){
			System.out.println("Name = "+ this.name+
				", address = "+ address+
				", age = "+age);
			System.out.println();
		}
}

class Task5{
	public static void main(String args[]){
		Student std1 = new Student();
		std1.setInfo("Ali", "Hyderabad");

		Student std2 = new Student();
		std2.setInfo("Osama", "Defence, Karachi",40);
		
		Student std3 = new Student();
		std3.setInfo("Ahmed", "Islamabad",20);
		
		Student std4 = new Student();
		std4.setInfo("Huzaifa", "Hyderabad");

		Student std5 = new Student();
		std5.setInfo("Sameed", "Defence, Karachi",40);
		
		Student std6 = new Student();
		std6.setInfo("Rashid", "Islamabad",20);
		
		Student std7 = new Student();
		std7.setInfo("Shahzaib", "Hyderabad");
		
		Student std8 = new Student();
		std8.setInfo("Babar", "Defence, Karachi",40);
		
		Student std9 = new Student();
		std9.setInfo("Azeem", "Islamabad",20);
		
		Student std10 = new Student();
		std10.setInfo("Umair", "Hyderabad");

		
	//Printing the details
		std1.getInfo();
		std2.getInfo();
		std3.getInfo();
		std4.getInfo();
		std5.getInfo();
		std6.getInfo();
		std7.getInfo();
		std8.getInfo();
		std9.getInfo();
		std10.getInfo();


	}
}