package ProductRepo;
import java.util.*;
import ModelApp.org.ProductModel;

public interface ProductRepoInt {
    public boolean isProductAdd(ProductModel model);
    ArrayList getProducts();
    boolean searchProduct(String name);
    boolean deleteProduct(String name);
    int getProductCount();
}
