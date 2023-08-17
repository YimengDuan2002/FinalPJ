import java.util.ArrayList;
import java.util.List;

public class Customer extends User{
	  public Customer() {
	       super();
	  }
	//Shopping Chart 
	private List<Product> shopcart = new ArrayList<>();
	
	
	public void viewAllProducts(Shop shop) {
        List<Product> products = shop.getAllProducts();
        for (Product product : products) {
            System.out.println("ID: " + product.getId() + ", Size: " + product.getSize() + ", Price: " + product.getPrice());
        }
    }
	
	public void AddToCart(Shop shop, int id) {
		Product p = shop.searchProductById(id);
		shopcart.add(p);
	}
	
	//Print all the items in the shopping cart
	public void DisplayShopCart() {
		for(Product i : shopcart ) {
			 System.out.println("ID: " + i.getId() + ", Size: " + i.getSize() + ", Price: " + i.getPrice());
		}
	}

}
