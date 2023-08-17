import java.util.List;

public class Employee extends User{
	public Employee() {
		super();
    }
	
	public void addProduct(Shop shop, Product product) {
        shop.addProduct(product);
    }

    public void searchProductById(Shop shop, int id) {
        Product product = shop.searchProductById(id);
        if (product != null) {
            System.out.println("Product found - ID: " + product.getId() + ", Size: " + product.getSize() + ", Price: " + product.getPrice());
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProductById(Shop shop, int id) {
        shop.deleteProductById(id);
    }

    public void updateProductPrice(Shop shop, int id, double newPrice) {
        shop.updateProductPrice(id, newPrice);
    }

    
}
