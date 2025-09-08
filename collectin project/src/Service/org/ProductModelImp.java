package Service.org;

import ModelApp.org.ProductModel;
import ProductRepo.ProductRepoClass;
import java.util.*;

public class ProductModelImp implements ProductModelRep{
    ProductRepoClass prc=new ProductRepoClass();
    @Override

    public boolean isProductAdd(ProductModel model) {
        return prc.isProductAdd(model);
    }

    @Override
    public ArrayList getProducts() {
        return prc.getProducts();
    }

    @Override
    public boolean searchProduct(String name) {
          return  prc.searchProduct(name);
    }

    @Override
    public boolean deleteProduct(String name) {

        return prc.deleteProduct(name);
    }

    @Override
    public int getProductCount() {
       return prc.getProductCount();
    }
}
