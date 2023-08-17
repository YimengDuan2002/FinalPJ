import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {	
	public static void main(String[] args) {
		Shop shop = new Shop();
		//Initializing the products page with several items  
        Product p1 = new Product( "S", 50.0);
        Product p2 = new Product( "M", 70.0);
        Product p3 = new Product( "L", 120.0);
        shop.addProduct(p1);
        shop.addProduct(p2);
        shop.addProduct(p3);

        
        //Login Page 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select the mode you are in(1.Employee 2.Customer):");
        int choice = scanner.nextInt();
        
        //The Employee Mode
        if(choice==1) {
        	Employee employee = new Employee();
        	boolean quit= false;
    		while (!quit){
    			System.out.println("Welcome to the shop, employee!");
    			System.out.println("======================================");
    			System.out.println("Choose one of the following options:");
    			System.out.println("(1)Add a new prodcut");
    			System.out.println("(2)Search a product by ID");
    			System.out.println("(3)View All products");
    			System.out.println("(4)Quit");
    			System.out.print("Enter your choice:");
    			int c = scanner.nextInt();
    			scanner.nextLine(); // Consume newline character
                switch (c) {
                case 1:
                	System.out.print("Enter the size of product(XS,S,M,L,XL):");
                	String size = scanner.next();
        			System.out.print("Enter the price of product: ");
        			Double price = scanner.nextDouble();
        			Product pro = new Product(size, price);
                    employee.addProduct(shop, pro);
                    System.out.println("");
                    break;
                case 2:
                	System.out.print("Enter the ID of product:");
                	int id = scanner.nextInt();
                	employee.searchProductById(shop,id);
                	System.out.println("");
                	
                	System.out.println("What you want to do next?");
        			System.out.println("(1)Delete this prodcut");
        			System.out.println("(2)Update price for this product");
        			System.out.println("(3)Back to main window");
        			int num = scanner.nextInt();
        			switch (num) {
        	         //Search by name
        	         case 1:
        	        	employee.deleteProductById(shop, id);
                     	System.out.println("");
        	        	break;
        	         case 2:
        	        	System.out.print("Enter the new price of product:");
                     	Double pri = scanner.nextDouble();
                     	employee.updateProductPrice(shop, id, pri);
                    	System.out.println("");
        	        	break;
        	         case 3:
        	        	 break;
        	
        			}	
                break;    
                case 3:
                	employee.viewAllProducts(shop);	
                	System.out.println("");
                	break;
                case 4:
                	quit=true;	
                	break;
                default:
                    System.out.println("Invalid choice. Please try again.");
               }    
    		}	
        }else if(choice==2) {
        	  Customer customer = new Customer();
        	  boolean quit= false;
      		while (!quit){
      			System.out.println("Welcome to the shop, customer!");
      			System.out.println("======================================");
      			System.out.println("Choose one of the following options:");
      			System.out.println("(1)Add to Shopping Cart");
      			System.out.println("(2)View all items in Shop cart");
      			System.out.println("(3)View All products");
      			System.out.println("(4)Quit");
      			System.out.print("Enter your choice:");
      			int c = scanner.nextInt();
      			scanner.nextLine(); // Consume newline character
                  switch (c) {         
                  case 1:
                	System.out.println("");
                  	System.out.print("Enter the ID of product:");
                  	int id = scanner.nextInt();   
                  	customer.AddToCart(shop, id);
                  	System.out.println("");
                  	break;
                  case 2:
                	  System.out.println("");
                  	System.out.println("Shopping Cart Item List");
                  	System.out.println("======================================");
                  	customer.DisplayShopCart();
                  	System.out.println("");
                  	break;
                  case 3:
                  	customer.viewAllProducts(shop);	
                  	System.out.println("");
                  	break;
                  case 4:
                  	quit=true;	
                  	break;
                  default:
                      System.out.println("Invalid choice. Please try again.");
                 }            	
      		}
    }
		
	
	}
}
	


