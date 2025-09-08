package ModelApp.org;

import java.util.ArrayList;

public class CustomerModel {
    private int custId;
    private String custName;
    private String orProname;
    private int oquantity;
    ArrayList productList=new ArrayList();

    public CustomerModel(int custId, String custName,ArrayList productList) {
        this.custId = custId;
        this.custName = custName;
        this.productList=productList;
        this.orProname = orProname;
        this.oquantity = oquantity;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setOquantity(int oquantity) {
        this.oquantity = oquantity;
    }

    public void setOrProname(String orProname) {
        this.orProname = orProname;
    }

    public void setProductList(ArrayList productList) {
        this.productList = productList;
    }

    public ArrayList getProductList() {
        return productList;
    }

    public int getCustId() {
        return custId;
    }

    public String getCustName() {
        return custName;
    }

    public String getOrProname() {
        return orProname;
    }

    public int getOquantity() {
        return oquantity;
    }
}
