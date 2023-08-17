import java.util.List;

public class User {
	public User() {	
	}
	public void viewAllProducts(Shop shop) {
    	System.out.println("Products List");
		System.out.println("=================================");
        List<Product> products = shop.getAllProducts();
        for (Product product : products) {
            System.out.println("ID: " + product.getId() + ", Size: " + product.getSize() + ", Price: " + product.getPrice());
        }
    }
}
