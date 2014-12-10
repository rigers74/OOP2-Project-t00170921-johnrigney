import java.io.*;

public class Vehicle extends Person implements Serializable{

  private String type; 
  public double price;
  public double vat;
  private double total;							 						   	      	       
  				
  public Vehicle(){
  		super();
	    type = "no type specified";
	    price = 0;
	    vat = 0;
	    total = 0;
    }

  public Vehicle(String type, double price, double vat, double total){
	     setType(type);
	     setPrice(price);
	     setVat(vat);
	     setTotal(total); 
  }

  public void setType(String type){
	     this.type = type;
  	}

  public void setPrice(double price){
	     this.price = price;
    }
    
  public void setVat(double vat){
	     this.vat = vat;
    }
    
  public void setTotal(double total){
	     this.total = total;
    }  
  
  public String getType(){
	     return type;
    }

  public double getPrice(){
	     return price;
  	}
  
  public double getVat(){
	     return vat;
  	}
  
  public double getTotal(){
	     return total;
  	}
  
  public String toString() {
	     return "Name:" + getName() + "\nAddress" + getAddress() + "\nType: " + getType() +
	     	"\nPrice: " + getPrice()+"\nVat: " + getVat()+"\nTotal: " + getTotal();
  	}
  				  								
}