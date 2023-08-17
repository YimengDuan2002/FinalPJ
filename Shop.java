import java.util.ArrayList;
import java.util.List;

//This class contains all the functions in the Shop Applicaiton
public class Shop {
    private List<Product> products = new ArrayList<>();
    
    
    //The Method allows for adding product 
    public void addProduct(Product product) {
        products.add(product);
    }
    
    //The method allows for searching product by ID
    public Product searchProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
    
    //The method allows for deleting product by ID
    public void deleteProductById(int id) {
        Product productToRemove = searchProductById(id);
        if (productToRemove != null) {
            products.remove(productToRemove);
        }
    }
    
    //This Method allows the employee to update for the price by ID 
    public void updateProductPrice(int id, double newPrice) {
        Product productToUpdate = searchProductById(id);
        if (productToUpdate != null) {
            productToUpdate.setPrice(newPrice);
        }
    }
    
    //Return the list of products
    public List<Product> getAllProducts() {
        return products;
    }
}
