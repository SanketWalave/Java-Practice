/*Example2: WAP to create class name as Product with field id,name and price and create array of object of size 10
 and find the product whose price is same

*/
import java.util.*;
class Product
{
	private int id;
	private String name;
	private int price;
	void setId(int id)
	{
		this.id=id;
	}
	int getId()
	{
		return id;
	}
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	void setPrice(int price)
	{
		this.price=price;
	}
	int getPrice()
	{
		return price;
	}
}
class Product1
{
	Product p[];
	void setProduct(Product p[])
	{
		this.p=p;
	}
	void show()
	{
		for(int i=0;i<p.length;i++)
		{
			System.out.println("\tid\t"+p[i].getId()+"\tname\t"+p[i].getName()+"\tprice\t"+p[i].getPrice());
		}
		System.out.println("Product with same price");
		for(int i=0;i<p.length;i++)
		{
			for(int j=i+1;j<p.length;j++)
			{
				if(p[i].getPrice()==p[j].getPrice())
				{
					System.out.println(p[i].getName()+"\tand\t"+p[j].getName()+"\thas same price");
				}
			}
		}	
	}
}

public class Product_AO
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		Product p[]=new Product[10];
		
		for(int i=0;i<p.length;i++)
		{
			p[i]=new Product();
			//Scanner sc=new Scanner(System.in);
			System.out.println("Enter id of product");
			int id=sc.nextInt();
			System.out.println("Enter name of product");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.println("Enter price of product");
			int price=sc.nextInt();
			
			p[i].setId(id);
			p[i].setName(name);
			p[i].setPrice(price);
		}
		Product1 p1=new Product1();
		p1.setProduct(p);
		p1.show();
	}
}