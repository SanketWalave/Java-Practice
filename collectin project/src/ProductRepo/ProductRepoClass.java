package ProductRepo;

import ModelApp.org.ProductModel;

import java.util.ArrayList;
import java.util.Iterator;


public class ProductRepoClass implements ProductRepoInt {
    ArrayList proal=new ArrayList();
    @Override
    public boolean isProductAdd(ProductModel model) {
        return proal.add(model);
    }
     public ArrayList getProducts() {

//        Integer.MIN_VALUE

         return proal;
     }

    @Override
    public boolean searchProduct(String name) {
        Iterator i=proal.iterator();
        while (i.hasNext())
        {
            Object obj=i.next();
            ProductModel pr=(ProductModel)obj;
            if(pr.getStock()==0)
            {
                System.out.println("\nstock finished\n");
                return false;
            }
            if(pr.getName().equals(name))
            {
                return true;
            }

        }
        return false;
    }

    @Override
    public boolean deleteProduct(String name) {
      Iterator  i=proal.iterator();
        while (i.hasNext())
        {
            Object obj=i.next();
            ProductModel pr=(ProductModel)obj;

            if(pr.getName().equals(name))
            {
                return getProducts().remove(pr);
            }

        }
        return false;
    }

    @Override
    public int getProductCount() {
        return proal.size();
    }
}
