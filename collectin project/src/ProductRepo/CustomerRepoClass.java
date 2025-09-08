package ProductRepo;

import ModelApp.org.CustomerModel;
import ModelApp.org.ProductModel;
import ModelApp.org.ValidCustModel;

import java.util.*;

public class CustomerRepoClass extends ProductRepoClass implements CustomerRepoInter {
    ArrayList cust = new ArrayList();

    // ArrayList proal=new ArrayList();
    ArrayList validcust = new ArrayList();

    @Override
    public boolean setCustomer(CustomerModel cm) {
        return cust.add(cm);
    }

    @Override
    public ArrayList getCustomer() {
        return cust;
    }





    @Override
    public void setValidCust(CustomerModel cm,ArrayList ProductList,int bill) {
        if (validcust.size() == 0) {
            ValidCustModel vcm = new ValidCustModel(cm.getCustId(), cm.getCustName(), cm.getOrProname(), cm.getOquantity(), 1,ProductList,bill);
            validcust.add(vcm);
            return;
        }

        boolean flag = true;
        Iterator i = validcust.iterator();
        while (i.hasNext()) {
            Object obj = i.next();
            ValidCustModel vcm1 = (ValidCustModel) obj;
            if (vcm1.getVcustId() == cm.getCustId() && vcm1.getVcustname().equals(cm.getCustName())) {
                flag = false;
                int vcustId = vcm1.getVvisitcount() + 1;
                vcm1.setVvisitcount(vcustId);
                return;
            }
        }

        if (flag) {
            ValidCustModel vcm3 = new ValidCustModel(cm.getCustId(), cm.getCustName(), cm.getOrProname(), cm.getOquantity(), 1,ProductList,bill);
            validcust.add(vcm3); // Add the new customer
        }
    }


    @Override
    public ArrayList getValidCust() {
        return validcust;
    }

    public ArrayList getProductsss() {
        System.out.println("1234567890-");
        return proal;
    }

    @Override
    public boolean deleteValidCust(String name) {
        Iterator  i=validcust.iterator();
        while (i.hasNext())
        {
            Object obj=i.next();
            ValidCustModel v=(ValidCustModel) obj;

            if(v.getVcustname().equals(name))
            {
                return getValidCust().remove(v);
            }

        }
        return false;
    }
}
