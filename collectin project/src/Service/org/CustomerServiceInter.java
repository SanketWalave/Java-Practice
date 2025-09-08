package Service.org;

import ModelApp.org.CustomerModel;
import ProductRepo.CustomerRepoClass;

import java.util.ArrayList;

public interface CustomerServiceInter {
    boolean setCustomer(CustomerModel cm);
    ArrayList getCustomer();
//    ArrayList getProduct();
    int isOrderSucsesfull(CustomerModel cs);
    ArrayList getValidCust();
    void setValidCust(CustomerModel cm,ArrayList ProductList,int bill);
    boolean deleteValidCust(String name);
}
