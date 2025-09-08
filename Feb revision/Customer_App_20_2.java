/*Q2. WAP to create class name as Product as POJO class with field id,name and qty and price and you have to create Shop as class with following methods 
void setProducts(Customer customer,Product …p): this method can accept the n number of products 
void findBill(): this function can find the bill of a customer using the following format.
*/
import java.util.*;
class Product
{
	private int id,price,qty;
	private String name;
	void setId(int id)
	{
		this.id=id;
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setPrice(int price)
	{
		this.price=price;
	}
	void setQuantity(int qty)
	{
		this.qty=qty;
	}
	int getId()
	{
		return id;
	}
	String getName()
	{
		return name;
	}
	int getPrice()
	{
		return price;
	}
	int getQuantity()
	{
		return qty;
	}
}
class Customer
{
	private int cid;
	private String cname,address;
	Customer(int cid,String cname,String address)
	{
		this.cid=cid;
		this.cname=cname;
		this.address=address;
	}
	int getCId()
	{
		return cid;
	}
	String getCname()
	{
		return cname;
	}
	String getAddress()
	{
		return address;
	}
}
class Shop
{
	private Product p[];
	private Customer c;
	void setProducts(Customer c,Product ...p)
	{
		this.c=c;
		this.p=p;
	}
	void findBill()
	{
		System.out.println("customer name ="+c.getCname()+"customer id = "+c.getCId()+"address= "+c.getAddress());
		System.out.println( "id\tname\t quantity\t rate\t total ");
		int sum=0;
		for(int i=0;i<p.length;i++)
		{
			int total=p[i].getQuantity()*p[i].getPrice();
			System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getQuantity()+"\t"+p[i].getPrice()+"\t"+total);
			sum+=total;
		}
		System.out.println("\t\t\ttotal= "+sum);
	}
}
public class Customer_App_20_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		Customer c=new Customer(1,"sanket","mirzapur");
		
		Product p[]=new Product[3];
		for(int i=0;i<p.length;i++)
		{
			p[i]=new Product();
			System.out.println("Enter product Id");
			int id=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter price");
			int price=sc.nextInt();
			System.out.println("Enter qty");
			int qty=sc.nextInt();
			
			p[i].setId(id);
			p[i].setName(name);
			p[i].setPrice(price);
			p[i].setQuantity(qty);
			
			
		}
		
		Shop sp=new Shop();
		sp.setProducts(c,p);
		sp.findBill();
	}
}