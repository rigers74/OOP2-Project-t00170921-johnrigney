/**This is an instantiable Person class.
 @author John Rigney
 @version 1.0 */ 


import java.io.*;

public class Person implements Serializable{
	
	private String name;
	private String address;
	
	/** No argument constructor method
	 @param name of Person
	 @param address of Person*/
	public Person() {
		this("No Name","None Specified");
	}
	
	/** Two argument constructor method
	 @param name of Person
	 @param address of Person*/
	public Person(String name, String address) {
		setName(name);
		setAddress(address);
	}
	/** acessor methods to return the student name
	 *@return the name of the Person 
	 *@return the address of the Person*/
	public void setName(String name) { 
				this.name = name;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	/** mutator method to set the Person name
	 *@param name the name of the Person
	 *@param name the address of the Person*/
	public String getName(){
		return name;
	}
	
	public String getAddress(){
		return address;
	}
	
}