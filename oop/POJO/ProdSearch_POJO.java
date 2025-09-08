import java.util.*;
class Product
{  private int id;
   private String name;
   private int price;
   
   public void setId(int i)
   { id=i;
   }
   public int getId(){
      return id;
   }
   public void setName(String n)
   { name=n;
   }
   public String getName(){
      return name;
   }
   public void setPrice(int p)
   { price=p;
   }
   public int getPrice()
   { return price;
   }
}
public class ProdSearch_POJO
{
    public static void main(String x[])
	{Scanner xyz  = new  Scanner(System.in);
	     
	   Product p[]=new Product[5]; //array of reference
	   for(int i=0;i<p.length;i++)
	   {  p[i]=new Product(); //array of objects 
		  System.out.println("ente name id and price of product");
		  String pname=xyz.nextLine();
		  int pid=xyz.nextInt();
		  int pprice=xyz.nextInt();
		  p[i].setName(pname);
		  p[i].setId(pid);
		  p[i].setPrice(pprice);
		  xyz.nextLine();
	   }
	   System.out.println("Display product details");
	   for(int i=0; i<p.length;i++)
	   {
	     System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getPrice());
	   }
	   boolean flag=false;
	   System.out.println("Enter product id for search");
	   int pid=xyz.nextInt();
	   for(int i=0; i<p.length;i++)
	   {
		     if(p[i].getId()==pid)
			 { flag=true;
		       break;
			 }
	   }
	   if(flag)
	   { System.out.println("Product found");
	   }
	   else
	   { System.out.println("Product Not Found");
	   }
	}
}
