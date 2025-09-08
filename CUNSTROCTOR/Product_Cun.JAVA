class Product
{
	private int pid;
	private String pname;
	private String catagary;
	private int quantity;
	private int price;
	Product() {}
	public Product(int pid,String pname,String catagary,int quantity,int price)
	{
		this.pid=pid;
		
		this.pname=pname;
		this.catagary=catagary;
		this.quantity=quantity;
		this.price=price;
	}
	void setPid(int pid)
	{
		this.pid=pid;
	}
	int getPid()
	{
		return pid;
		
	}
}
class Show
{
	Product p;
	void show(Product p)
	{
		System.out.println("\t\t"+p.getPid());
	}
}

public class Product_Cun
{
	public static void main (String x[])
	{
		Product p=new  Product(123,"sadd","SSSSSS",456,567);
		//new
		int pid=p.getPid();
		System.out.println(pid);
		
		Show s=new Show();
		s.show(p);
		
	}
}