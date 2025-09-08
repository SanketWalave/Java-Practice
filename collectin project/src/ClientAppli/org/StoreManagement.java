package ClientAppli.org;

import ModelApp.org.*;
import Service.org.CustomerServiceClass;
import Service.org.ProductModelImp;
import java.util.*;
/*Add Products in collection                               done
View All products in collection                            done
Search Product from collection                             done
Delete Product from collection                             done
Count total number of products from collection             done
Create Customer collection                                 done
Maintain purchase order of customer                        done
View individual custom orders                              done
View all customer reports                                  done
Delete customer and its order                              done
Update customer orders
*/

public class StoreManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductModelImp pmi = new ProductModelImp();
        CustomerServiceClass csc = new CustomerServiceClass();
        boolean usercheck = true;

        int default1=1;
        pmi.isProductAdd(new ProductModel(1,"aa","aa",100,100,100));
        pmi.isProductAdd(new ProductModel(2,"bb","bb",200,100,100));
        pmi.isProductAdd(new ProductModel(3,"cc","cc",300,100,100));

        do {
            String admin = "";

            int lcount = 0;
            while (usercheck) {
                System.out.println("you want to procidu as");
                System.out.println("1:Owner");
                System.out.println("2:Customer");
                int user = sc.nextInt();

                if (user == 1) {
                    int ucount = 3;
                    System.out.println("you ar owner");

                    while (usercheck) {
                        System.out.println("enter name and pasword to login");
                        String uname = sc.next();
                        String upassword = sc.next();
                        if (uname.equals("sanket") && upassword.equals("Sanket@123")) {
                            admin = "owner";
                            usercheck = false;
                        }
                        ucount--;
                        if (ucount == 0) {
                            System.out.println("you have to login again");
                            usercheck = false;
                            System.exit(0);

                        }
                    }
                } else if (user == 2) {
                    admin = "customer";
                    usercheck = false;
                } else {
                    System.out.println("invalid choice");
                    lcount++;
                    if (lcount == 3) {
                        usercheck = false;
                        break;
                    }
                }

            }


            while (admin.equals("owner")) {
                System.out.println("1:Add Products in collection ");
                System.out.println("2:View All products in collection");
                System.out.println("3:Search Product from collection ");
                System.out.println("4:Delete Product from collection");
                System.out.println("5:Count total number of products from collection");
                System.out.println("6:get  customers whose order  successful ");
                System.out.println("7: delete customer  record");
                System.out.println("8: view  customer whose order not successful ");
                System.out.println("9:leave as owner");
                System.out.println("10:leave whole system");
                System.out.println("enter your choice");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        try {
                            System.out.println("enter id");
                            int id = sc.nextInt();
                            System.out.println("enter name");

                            String name = sc.next();
                            System.out.println("entor company");
                            String company = sc.next();
                            System.out.println("enter price");
                            int price = sc.nextInt();
                            System.out.println("enter qntity");
                            int qty = sc.nextInt();
                            System.out.println("enter stock");
                            int stock = sc.nextInt();

                            ProductModel proModel = new ProductModel(id, name, company, price, stock, qty);

//                    PrductModel proModel=new ProductModel(id,name,company,price,stock,qty);

                            boolean b = pmi.isProductAdd(proModel);
                            if (b)
                                System.out.println("product added\n\n");
                            else
                                System.out.println("product not added\n\n");
                        }
                        catch(Exception ex)
                        {
                            System.out.println(ex);
                        }
                        break;
                    case 2:
                        ArrayList al = pmi.getProducts();
                        Iterator i = al.iterator();
                        System.out.println("=====================================================");
                        while (i.hasNext()) {
                            Object obj = i.next();
                            ProductModel pr = (ProductModel) obj;
                            System.out.println("product Id          \t" + pr.getId());
                            System.out.println("product name        \t" + pr.getName());
                            System.out.println("product company     \t" + pr.getCompany());
                            System.out.println("product price       \t" + pr.getPrice());
                            System.out.println("product stock       \t" + pr.getStock());
                            System.out.println("product quantity    \t" + pr.getQty());
                            System.out.println("=====================================================");

                        }
                        break;
                    case 3:
                        System.out.println("enter product name to search");
                       String name = sc.next();
                       Boolean b = pmi.searchProduct(name);
                        if (b) {
                            System.out.println("product found");
                        } else
                            System.out.println("product not found");
                        break;
                    case 4:
                        System.out.println("enter product name to search");
                        name = sc.next();
                        b = pmi.deleteProduct(name);
                        if (b)
                            System.out.println("product deleted sucsessfully");
                        else
                            System.out.println("product not deletet");
                        break;
                    case 5:
                        System.out.println("Total numbar of products present in Shop " + pmi.getProductCount());
                        break;
                    case 6:
                        ArrayList validcust = csc.getValidCust();
                        Iterator ivc = validcust.iterator();
                        System.out.println("=====================================================");
                        while (ivc.hasNext()) {
                            Object obj = ivc.next();
                            ValidCustModel v = (ValidCustModel) obj;
// (int vcustId, String vcustname, String vOrderdProduct, int vOrderQuantity, int vvisitcount)
                            System.out.println("customer id        \t" + v.getVcustId());
                            System.out.println("customer name      \t" + v.getVcustname());
                            System.out.println("orderd product     \t" + v.getvOrderdProduct());
                            System.out.println("product quantity   \t" + v.getvOrderQuantity());
                            System.out.println("visit count to shop\t" + v.getVvisitcount());
                            System.out.println("=======================================================");
                            System.out.println("product name \t\t Product quantity");
                            ArrayList vcpl=v.getProductList();
                            Iterator  vpl1=vcpl.iterator();
                            while(vpl1.hasNext())
                            {
                                Object objvpl1=vpl1.next();
                                ProductList plo=(ProductList) objvpl1;
                                System.out.println(plo.getProductName()+"\t\t\t"+plo.getProductquantity());


                            }
                            System.out.println("=========================================================");
                        }
                        break;
                    case 7:
                        System.out.println("enter customer name to delete record");
                        String c7name = sc.next();
                        b = csc.deleteValidCust(c7name);
                        if (b)
                            System.out.println("\ncustomer deleted sucsessfully\n");
                        else
                            System.out.println("\ncustomer not deleted \n");

                        break;
                    case 8:
                        System.out.println("enter customer name to find record");
                        String c8name = sc.next();
                        validcust = csc.getValidCust();
                        Iterator ivc8 = validcust.iterator();
                        boolean flag8 = true;
                        System.out.println("=====================================================");
                        while (ivc8.hasNext()) {
                            Object obj = ivc8.next();
                            ValidCustModel v = (ValidCustModel) obj;
                            if (v.getVcustname().equals(c8name)) {
                                System.out.println("customer id        \t" + v.getVcustId());
                                System.out.println("customer name      \t" + v.getVcustname());
                                System.out.println("orderd product     \t" + v.getvOrderdProduct());
                                System.out.println("product quantity   \t" + v.getvOrderQuantity());
                                System.out.println("visit count to shop\t" + v.getVvisitcount());
                                System.out.println("=======================================================");
                                System.out.println("product name \t\t Product quantity");
                                ArrayList vcpl=v.getProductList();
                                Iterator  vpl1=vcpl.iterator();
                                while(vpl1.hasNext())
                                {
                                    Object objvpl1=vpl1.next();
                                    ProductList plo=(ProductList) objvpl1;
                                    System.out.println(plo.getProductName()+"\t\t\t\t\t\t\t\t"+plo.getProductquantity());


                                }
                                System.out.println("=========================================================");
                                flag8 = false;
                            }
                        }
                        if (flag8)
                            System.out.println("customer not visited shop");
                        break;



                    case 9:
                        admin = "";
                        usercheck = true;
                        lcount = 3;
                        break;
                    case 10:
                        System.exit(0);
                        break;
                    default:

                        break;

                }
            }

            while (admin.equals("customer")) {
                System.out.println("1:enter customer and order details ");
                System.out.println("2:view customer who visited shop1");

                System.out.println("3:leave as customer");
                System.out.println("4:leave whole system");
                System.out.println("enter your choice");
                int cchoice = sc.nextInt();
                int custId = 1;
                switch (cchoice) {
                    case 1:
                        try {
                            ArrayList productList = new ArrayList();

                            //public CustomerModel(int custId, String custName, String orProname, int oquantity)
//                            try { }catch (Exception e){}
                                System.out.println("enter customer id");
                                custId = sc.nextInt();
                                System.out.println("enter customer name");
                                String custName = sc.next();
                                boolean prolist = true;
                                while (prolist) {

                                    System.out.println("enter order name");
                                    String orProname = sc.next();
                                    System.out.println("enter quantity customer required");
                                    int oquantity = sc.nextInt();
                                    ProductList pl = new ProductList(orProname, oquantity);
                                    productList.add(pl);
                                    System.out.println("if you want to add one more product then enter 1");
                                    int prolistch = sc.nextInt();

                                    if (prolistch != 1) {
                                        prolist = false;
                                    }
                                }
                            if(default1==1){
                                csc.setCustomer(new CustomerModel(1,"sanket",new ArrayList<ProductList>(List.of(new ProductList("aa", 5)))));
                                csc.setCustomer(new CustomerModel(2,"ram",new ArrayList<ProductList>(List.of(new ProductList("aa", 5)))));
                                csc.setCustomer(new CustomerModel(3,"sham",new ArrayList<ProductList>(List.of(new ProductList("aa", 5)))));

                                default1++;
                            }
                            CustomerModel cm = new CustomerModel(custId, custName, productList);
                            csc.setCustomer(cm);
//                        int bill =csc.isOrderSucsesfull(cm);
                            int bill = 0;


                            ArrayList<ProductList> plist = cm.getProductList();

                            Iterator pli = plist.iterator();
                            System.out.println("=====================================================");
                            while (pli.hasNext()) {
                                Object obj = pli.next();
                                ProductList prl = (ProductList) obj;
                                ArrayList al = pmi.getProducts();
                                Iterator i = al.iterator();
                                while (i.hasNext()) {
                                    Object obj1 = i.next();
                                    ProductModel pr1 = (ProductModel) obj1;
                                    // System.out.println(pr1.getName());
                                    if (pr1.getName().equals(prl.getProductName())) {
                                        //  System.out.println("product found");
                                        if (pr1.getStock() >= prl.getProductquantity()) {
                                            int qty = pr1.getStock();
                                            int qtyreq = prl.getProductquantity();
                                            int req = qty - qtyreq;
                                            pr1.setStock(req);

                                            int bill1 = prl.getProductquantity() * pr1.getPrice();
                                            bill += bill1;
                                            System.out.println(bill);

                                        } else {
                                            System.out.println("Product quantity is insufficiant for  " + prl.getProductName());
                                        }

                                    }
                                }
                            }
                            if (bill == 0) {
                                System.out.println("order cansl ");
                            } else {
                                csc.setValidCust(cm, productList, bill);
                                System.out.println("order sucsesfull");
                                System.out.println("enter 1 if you want to see your bill ");
                                int getBill = sc.nextInt();
                                if (getBill == 1) {
                                    System.out.println("customer id   \t" + cm.getCustId());
                                    System.out.println("customer name \t" + cm.getCustName());
//                                System.out.println("order name    \t" + cm.getOrProname());
//                                System.out.println("order quantity\t" + cm.getOquantity());
                                    System.out.println("=================================================");
                                    System.out.println("product name\tquantity\tprice\t\ttotal");
                                    plist = cm.getProductList();
                                    pli = plist.iterator();
                                    while (pli.hasNext()) {
                                        boolean flag = false;
                                        Object obj = pli.next();
                                        ProductList prl = (ProductList) obj;
                                        ArrayList al = pmi.getProducts();
                                        Iterator i = al.iterator();
                                        while (i.hasNext()) {
                                            Object obj1 = i.next();
                                            ProductModel pr1 = (ProductModel) obj1;

                                            if (pr1.getName().equals(prl.getProductName()) && prl.getProductquantity() > 0) {
                                                int pricec = prl.getProductquantity() * pr1.getPrice();
                                                flag = true;
                                                System.out.println(prl.getProductName() + "\t\t\t\t" + prl.getProductquantity() + "\t\t\t" + pr1.getPrice() + "\t\t" + pricec);
                                                break;
                                            }


                                        }

                                    }
                                    System.out.println("=================================================");
                                    System.out.println("\t      bill= " + bill);
                                    System.out.println("=================================================");
                                }

                            }
                        }catch(Exception ex)
                        {
                            System.out.println(ex);
                        }
                            break;
                            case 2:

                                ArrayList cust = csc.getCustomer();
                                Iterator ic = cust.iterator();
                                System.out.println("=================================================");
                                while (ic.hasNext()) {
                                    Object obj = ic.next();
                                    CustomerModel cm1 = (CustomerModel) obj;
                                    System.out.println("customer id   \t" + cm1.getCustId());
                                    System.out.println("customer name \t" + cm1.getCustName());
                                    System.out.println("order name    \t" + cm1.getOrProname());
                                    System.out.println("order quantity\t" + cm1.getOquantity());
                                    System.out.println("=================================================");

                                }
                                break;

                            case 3:
                                admin = "..";
                                usercheck = true;
                                lcount = 3;
                                break;
                            case 4:
                                System.exit(0);
                                break;
                            default:
                                System.out.println("invalid choice");
                                break;
                        }

                }

            } while (true) ;
        }

    }


/*System.out.println("6:Create Customer collection");
                System.out.println("7:Maintain purchase order of customer");
                System.out.println("8:View individual custom orders");
                System.out.println("9:View all customer reports");
                System.out.println("10:Delete customer and its order");
                System.out.println("11:Update customer orders");*/