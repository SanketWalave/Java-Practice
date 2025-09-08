/*Q3. WAP to class name as Order with parameterized  
Order(Customer customer,Product ...p): this constructor accept Customer details and Product details 
Customer is POJO class with field id,name and email,contact 
and Product with id name qty  rate and total '

void showOrder(): you have to display output like as 

Example:
Customer ID  : 1
Customer Name: Ram
Customer Email: ram@gmail.com
Customer Contact : 9999999999

Product Details
____________________________________________
ID	NAME	Quantity	Rate	Total
____________________________________________
1	A		10			10		100
2	B		10			100		1000
3	C		20			200		4000
____________________________________________
			         Total : 51000
*/
import java.util.*;
class Order
{
	
}
class Customer
{
	private int id;
	private String name;
	private int qnty;
	private int  rate;
	private int total;
	
	
	
	void steId(int id)
	{
		this.id=id;
	}
	int getId()
	{
		return id;
	}
	void 
}
public class Product_Pojo_cun
{
	public static void main(String x[])
	{
		
		
	}
}
/*/* Q3. WAP to class name as Order with parameterized  
Order(Customer customer,Product ...p): this constructor accept Customer details and Product details 
Customer is POJO class with field id,name and email,contact 
and Product with id name qty  rate and total '

void showOrder(): you have to display output like as 

Example:
Customer ID  : 1
Customer Name: Ram
Customer Email: ram@gmail.com
Customer Contact : 9999999999

Product Details
____________________________________________
ID	NAME	Quantity	Rate	Total
____________________________________________
1	A	10		10	100
2	B	10		100	1000
3	C	20		200	4000



import java.util.*;

class product{
	private int id;
	private String name;
	private int qty;
	private int rate;
	
	product(int id, String name, int qty, int rate){
		this.id=id;
		this.name=name;
		this.qty=qty;
		this.rate=rate;
	}
	 
	int getId(){
		return id;
	}
	String getName(){
		return name;
	}
	int getQty(){
		return qty;
	}
	int getRate(){
		return rate;
	}
}

class customer{
	private int id;
	private String name;
	private String email;
	private int contact;
	
	customer(int id, String name, String email, int contact){
		this.id=id;
		this.name=name;
		this.email=email;
		this.contact=contact;
	}
	 
	int getCid(){
		return id;
	}
	String getCname(){
		return name;
	}
	String getEmail(){
		return email;
	}
	int getContact(){
		return contact;
	}
}

class Order
{
	customer c;
	product p[];
	Order(customer c,product ...p){
		this.c=c;
		this.p=p;
	}
	void showOrder(){
		int total,total2=0;
		System.out.println("----------------------------------------------");
		System.out.println("Customer ID: "+c.getCid());
		System.out.println("Customer name: "+c.getCname());
		System.out.println("Customer email: "+c.getEmail());
		System.out.println("Customer contact: "+c.getContact());
		System.out.println("\n Product Details");
		System.out.println("----------------------------------------------");
		System.out.println("ID\tName\tQuantity\tRate\tTotal");
		System.out.println("----------------------------------------------");
		for(int i=0;i<p.length;i++){
			total=p[i].getQty() * p[i].getRate(); 
			total2=total2+total;
			System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getQty()+"\t\t"+p[i].getRate()+"\t"+total);
		}
		System.out.println("----------------------------------------------");
		System.out.println("Total = "+total2);
		
	}
}

class orderApp
{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		product p[]=new product[3];
		customer c;
		
		for(int i=0;i<p.length;i++){
			System.out.print("Enter product id: ");
			int id=sc.nextInt();
			System.out.print("Enter product name: ");
			String n=sc.next();
			System.out.print("Enter product quantity: ");
			int q=sc.nextInt();
			System.out.print("Enter product rate: ");
			int r=sc.nextInt();
			
			p[i]=new product(id,n,q,r);
		}
		
			System.out.print("\nEnter Customer id: ");
			int cid=sc.nextInt();
			System.out.print("Enter Customer name: ");
			String cn=sc.next();
			System.out.print("Enter Customer email: ");
			String e=sc.next();
			System.out.print("Enter Customer contact: ");
			int ct=sc.nextInt();
			
			c=new customer(cid,cn,e,ct);
			
			Order o=new Order(c,p);
			o.showOrder();
			
	}
}
*/