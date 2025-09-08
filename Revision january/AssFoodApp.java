/*3. Food Item Details:
Create a FoodItem class with fields itemName, price, and calories.
In a FoodOrder class, implement a method to calculate the total price of multiple items, considering their prices.
*/
import java.util.*;

class FoodItem{
	private String itemName;
	private int price;
	private int calories;
	
	public void setItemName(String itemName){
		this.itemName = itemName;
	}
	public String getItemName(){
		return itemName;
	}
	
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}	
	
	public void setCalories(int calories){
		this.calories = calories;
	}
	public int getCalories(){
		return calories;
	}
}
class FoodOrder{
	private FoodItem [] food ;
	private int  totalPrice = 0;
	private int totalCalories = 0;
	public void calculate(FoodItem ...food){
		for(FoodItem f : food){
			totalPrice += f.getPrice();
			totalCalories += f.getCalories();
			System.out.println(f.getItemName() +"\t\t" + f.getPrice() + "\t\t" + f.getCalories() );
			
		}
		System.out.println("Total Price: "+ totalPrice + "\t\t "+ "Total Calories: "+ totalCalories);
		System.out.println();
	}
}
public class AssFoodApp{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		FoodItem [] food = new FoodItem[2];
		
		for(int i = 0; i < food.length ; i++){
			System.out.println("===============================================================");

			System.out.println("Enter item name: ");
			String itemName = sc.nextLine();
			
			System.out.println("Price: ");
			int price = sc.nextInt();
			
			System.out.println("Calories: ");
			int calories = sc.nextInt();
			System.out.println("===============================================================");

			sc.nextLine();
			
			System.out.println();
			food[i] = new FoodItem();
			food[i].setItemName(itemName);
			food[i].setPrice(price);
			food[i].setCalories(calories);
		}
		System.out.println("===============================================================");

		System.out.println("Item Name" +"\t"+ "Price" +"\t\t"+ "Calories");
		FoodOrder f = new FoodOrder();
		f.calculate(food);
	
	}
}