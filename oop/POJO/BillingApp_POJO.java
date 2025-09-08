/*Q2. WAP to develop the billing application using the following classes.
Product class with field id,name,qty,rate and mark as product as POJO class
Customer class with field id,name,address,contact and mark customer as POJO class
Bill class with following methods 
Void setOrder(Customer c,Product …p) : this method can accept customer details 
and customer product list and calculate its bill and show output using following fashion 
*/
class Product
{
    //Product class with field id,name,qty,rate and mark as product as POJO class
	private int pId;
	private String pname;
	private int pquantity;
	private int rate;
	void setPId(int idp)
	{
		pId=idp;
	}
	int getPId()
	{
		return pId;
	}
	void setPName(String pnm)
	{
		pname=pnm;
	}
	String getPName()
	{
		return pname;
	}
	void setPQuantity(int qty)
	{
		pquantity=qty;
	}
	int getPQuantity()
	{
		return pquantity;
	}
	void setRate(int rt)
	{
		rate=rt;
	}
	int getRate()
	{
		return rate;
	}	
}
class Customer
{
	//Customer class with field id,name,address,contact and mark customer as POJO class
	private int cid;
	private String cName;
	private String address;
	private long contact;
	void setCid(int idc)
	{
		cid=idc;
	}	
	int getCid()
	{
		return cid;
	}
	void setCuName(String cname)
	{
		cName=cname;
	}
	String getCuName()
	{
		return cName;
	}
	void setAdd(String add)
	{
		address=add;
	}
	String getAdd()
	{
		return address;
	}
	void setContact(long cnt)
	{
		contact=cnt;
	}
	long getContact()
	{
		return contact;
	}
}
/*Bill class with following methods 
Void setOrder(Customer c,Product …p) : this method can accept customer details 
and customer product list and calculate its bill and show output using following fashion 
*/
class Bill
{
	Product product[];
	Customer customer;
	void setOrder(Customer c,Product ...p)
	{
		product=p;
		customer=c;
	}
	void showCustomer()
	{
		System.out.println("\n\ncustomer id->"+customer.getCid()+"\tcustomer name->"+customer.getCuName()+"\tcustomer address->"+customer.getAdd()+"\tcustomer contact->"+customer.getContact()+"\n\n");
	}
	void billing()
	{    int sum=0;
		System.out.println("product id  product name  product quantity  rate \t    total");
		for(int i=0;i<product.length;i++)
		{
			System.out.println("\n"+product[i].getPId()+"\t\t"+product[i].getPName()+"\t\t"+product[i].getPQuantity()+"\t\t"+product[i].getRate()+"\t\t"+product[i].getPQuantity()*product[i].getRate());
			int total=product[i].getPQuantity()*product[i].getRate();
			sum+=total;
		}
		System.out.println("_______________________________________________________________________");
		System.out.println("\t\tTotal bill without gst :"+sum);
		int gst=18*sum/100;
		sum+=gst;
		System.out.println("\t\tTotal bill with gst :"+sum);
	}

	
}
public class BillingApp_POJO
{
	public static void main(String x[])
	{
		Customer c1=new Customer();
		Product p1=new Product();
		Bill b=new Bill();
		
		c1.setCid(123);
		c1.setCuName("SSSS");
		c1.setAdd("gfgvbibuiurh ");
		c1.setContact(43534);
		
		p1.setPId(1);
		p1.setPName("ata");
		p1.setPQuantity(3);
		p1.setRate(30);
		
		Product p2=new Product();
		p2.setPId(2);
		p2.setPName("ata");
		p2.setPQuantity(5);
		p2.setRate(30);
		
		Product p3=new Product();
		p3.setPId(5);
		p3.setPName("ata");
		p3.setPQuantity(3);
		p3.setRate(38);
		
		b.setOrder(c1,p1,p2,p3);
		b.showCustomer();
		b.billing();
		
	}
}