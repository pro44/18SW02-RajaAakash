class Author{
	private	String name;
	private String email;
	private char gender;
	
	//Constructor
	Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	//Setters
	public void setEmail(String email){
		this.email = email;
	}
	
	//Getters
	public String getName(){
		return this.name;
	}
	public String getEmail(){
		return this.email;
	}
	public char getGender(){	
	return this.gender;
	}
	public String toString(){
		return "Author[name = "+this.name+", email = "+this.email+", gender = "+this.gender;
	}

	
}


class Task1{
public static void main(String args[]){

Author Osama = new Author("Osama","osama@abc.com",'m');

System.out.println(Osama.getName());
System.out.println(Osama.getEmail());
System.out.println(Osama.getGender());

Osama.setEmail("abc@abc.com");

System.out.println(Osama.toString());


}
}