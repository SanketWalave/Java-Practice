package ProductRepo;

import ModelApp.org.CustomerModel;

import java.util.ArrayList;

public interface CustomerRepoInter {
   boolean setCustomer(CustomerModel cm);
   ArrayList getCustomer();
   void setValidCust(CustomerModel cm,ArrayList ProductList,int bill);
   ArrayList getValidCust();

   ArrayList getProductsss();
//   void setProduct(ProductRepoClass prc);
//   ArrayList getProduct();
//   void setValidCust(CustomerModel cm);
   boolean deleteValidCust(String name);
}
