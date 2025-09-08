package ModelApp.org;

import java.util.ArrayList;

public class ValidCustModel {
    private int vcustId;
    private String vcustname;
    private String vOrderdProduct;
    private int vOrderQuantity;
    private int vvisitcount;
    private ArrayList ProductList;
    private int bill;

    public ValidCustModel() {

    }

    public ValidCustModel(int vcustId, String vcustname, String vOrderdProduct, int vOrderQuantity, int vvisitcount, ArrayList ProductList, int bill) {
        this.vcustId = vcustId;
        this.vcustname = vcustname;
        this.vOrderdProduct = vOrderdProduct;
        this.vOrderQuantity = vOrderQuantity;
        this.vvisitcount = vvisitcount;
        this.ProductList = ProductList;
        this.bill = bill;
    }

    public void setVcustId(int vcustId) {
        this.vcustId = vcustId;
    }

    public void setVcustname(String vcustname) {
        this.vcustname = vcustname;
    }

    public void setvOrderdProduct(String vOrderdProduct) {
        this.vOrderdProduct = vOrderdProduct;
    }

    public void setvOrderQuantity(int vOrderQuantity) {
        this.vOrderQuantity = vOrderQuantity;
    }

    public void setVvisitcount(int vvisitcount) {
        this.vvisitcount = vvisitcount;
    }

    public void setProductList(ArrayList productList) {
        ProductList = productList;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public int getBill() {
        return bill;
    }

    public int getVcustId() {
        return vcustId;
    }

    public int getvOrderQuantity() {
        return vOrderQuantity;
    }

    public int getVvisitcount() {
        return vvisitcount;
    }

    public String getVcustname() {
        return vcustname;
    }

    public String getvOrderdProduct() {
        return vOrderdProduct;
    }

    public ArrayList getProductList() {
        return ProductList;
    }
}
