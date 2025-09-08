/*3. Food Item Details:
Create a FoodItem class with fields itemName, price, and calories.
In a FoodOrder class, implement a method to calculate the total price of multiple items, considering their prices.
*/
import java.util.*;
class FoodItem
{
	private String itemName;
	private int price;
	private int calories;
	FoodItem(String itemName,int price,int calories)
	{
		this.itemName=itemName;
		this.price=price;
		this.calories=calories;
	}
	String getItemName()
	{
		return itemName;
	}
	int getPrice()
	{
		return price;
	}
	int getCalares()
	{
		return calories;
	}
}
class FoodOrder
{
	private FoodItem []f;
	private int total=0;
	void setArray(FoodItem ...f)
	{
		this.f=f;
	}
	void getTotal()
	{
		System.out.println("===========================================================================");
		System.out.println("product name\t\t Product price\t\t calories");
		System.out.println("");
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i].getItemName()+"\t\t\t\t"+f[i].getPrice()+"\t\t "+ f[i].getCalares());
			total+=f[i].getPrice();
		}
		System.out.println("===========================================================================");

		System.out.println("\t\t\tTotal   "+total);

	}
}
public class FoodApp_15_1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		FoodItem f1= new FoodItem("paneer",100,100);
		FoodItem f2= new FoodItem("paneer",100,100);
		FoodItem f3= new FoodItem("paneer",100,100);
		FoodItem f4= new FoodItem("paneer",100,100);
		
		FoodOrder fo=new FoodOrder();
		fo.setArray(f1,f2,f3,f4);
		fo.getTotal();
	}
}