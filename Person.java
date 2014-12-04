
public class Person{
	
	private String name;
	private String address;

	
	public String getName(){
		 return name;
		  }
	
	public String getAddress(){
		 return address;
		  }
	
	public void setPerson(String name, String address) {
		setName(name);
		setAddress(address);
	}
	
	private void setName(String name) { 
				this.name = name;		 
	}
	
	private void setAddress(String address){
		this.address = address;
	}
	
	public Person() {
		this("No Name","None Specified");
	}
	
	public Person(String name,String address) {
		setName(name);
		setAddress(address);
	}
	
	
}