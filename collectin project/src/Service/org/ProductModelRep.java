package Service.org;

import ModelApp.org.ProductModel;

import java.util.ArrayList;

public interface ProductModelRep {
     boolean isProductAdd(ProductModel model);
     ArrayList getProducts();
     boolean searchProduct(String name);
     boolean deleteProduct(String name);
     int getProductCount();
}
