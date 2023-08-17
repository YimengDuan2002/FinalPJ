
public class Product {
	private static int numofproducts = 0;
	private int id;
    private String size;
    private double price;
  
    
    
    //Getters
    public Product(String size, double price) {
    	this.id= numofproducts+1;
        this.size = size;
        this.price = price;
        numofproducts++;
        
    }
    public int getId() {
        return id;
    }
    public String getSize() {
        return size;
    }
    public double getPrice() {
        return price;
    }
  
    
    //Setters--Allowing for updating the price 
    public void setPrice(double price) {
        this.price = price;
    }
    
   
    

 
}
