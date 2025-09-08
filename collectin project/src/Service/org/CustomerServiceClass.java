package Service.org;

import ModelApp.org.CustomerModel;
import ModelApp.org.ProductModel;
import ProductRepo.CustomerRepoClass;
import ProductRepo.ProductRepoClass;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomerServiceClass extends ProductModelImp implements  CustomerServiceInter{
    CustomerRepoClass crc=new CustomerRepoClass();
    ProductRepoClass prc=new ProductRepoClass();


    @Override
    public boolean setCustomer(CustomerModel cm) {
        return crc.setCustomer(cm);
    }

    @Override
    public ArrayList getCustomer() {
        return crc.getCustomer();
    }

   // @Override
//    public ArrayList getProduct() {
//       return crc.getProduct();
//    }

    @Override
    public int isOrderSucsesfull(CustomerModel cm) {
        ArrayList pr=prc.getProducts();
        System.out.println("Available products:");
        for (Object obj : pr) {
            ProductModel pr1 = (ProductModel) obj;
            System.out.println(pr1.getName());
        }
        System.out.println("User entered product: " + cm.getOrProname());

        System.out.println(pr.size());
        Iterator i=pr.iterator();
        while (i.hasNext())
        {
            Object obj=i.next();
            ProductModel pr1=(ProductModel) obj;
            System.out.println(pr1.getName());
            if(pr1.getName().equals(cm.getOrProname()) )
            {
                System.out.println("product found");
                if(cm.getOquantity()<=pr1.getStock())
                {
                    int qty=pr1.getStock();
                    int qtyreq=cm.getOquantity();
                    int req=qty- qtyreq;
                    pr1.setStock(req);

                   int bill= cm.getOquantity()*pr1.getPrice();
                    System.out.println(bill);
                    return bill;
                }

            }
        }
        return 0;
    }

    @Override
    public ArrayList getValidCust() {
        return crc.getValidCust();
    }




    @Override
    public void setValidCust(CustomerModel cm,ArrayList ProductList,int bill) {
        crc.setValidCust(cm,ProductList,bill);
    }

    @Override
    public boolean deleteValidCust(String name) {
       return  crc.deleteValidCust(name);
    }


}
