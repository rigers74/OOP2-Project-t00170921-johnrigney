
public class Vehicle extends Person{

  private String type; 
  private int price;							 						 
  private Person driver;  	      	       
  				
  public Vehicle() {
	    type = "no type specified";
	    price = 0;
	    driver = new Person();
    }

  public Vehicle(String type,int price,String name, String address) {
	     setType(type);
	     setPrice(price);
	     driver = new Person(name, address); 
	    
    }

  public String getType(){
	     return type;
    }

  public int getPrice(){
	     return price;
  	}

  public void setType(String type){
	     type = type;
  	}

  public void setPrice(int price){
	     price = price;
    }

  public void setDriver(String name, String address){
  	driver.setPerson(name,address);
  	}
  
  public String toString() {
	     return "\nType: " + type +"\nPrice: " + price + driver.toString();
  	}
  				  								
}
	