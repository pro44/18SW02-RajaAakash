class Dog{
	String name;
	String breed;
	int age;
	public void setDetails(String name,String breed,int age){
		this.name=name;
		this.breed=breed;
		this.age=age;
	}
	public void showDetails(){
		if(name!="" && breed!="" && age!=0){
			System.out.println("Name:"+name+"\nBreed:"+breed+"\nAge:"+age);}
		else{
			System.out.println("Details are Unavailabe");
	}
}
}
class Task3{
	public static void main(String args[]){
		Dog d=new Dog();
		d.setDetails("Tommy","aa",12);
		d.showDetails();
	}
}