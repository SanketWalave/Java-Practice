/*Problem Statement:
Create a Food Management System using a Vector in Java. Implement a Food POJO (Plain Old Java Object)
class with the following properties:

    foodId (int)
    foodName (String)
    price (double)
    category (String)


Perform 10 different operations on a Vector list:

    1.Add Food Items: Allow the user to add food items to the vector.
    2.Display All Food Items: Show all available food items.
	3.Search Food by Name: Find and display food items based on a given name.
	4.Update Food Price by ID: Modify the price of a food item by providing its foodId.
	5.Delete a Food Item by ID: Remove a food item from the vector using its foodId.
	6.Sort Food Items by Price: Sort the food items in ascending order of price.
	7.Filter Food by Category: Display all food items belonging to a specific category (e.g., "Dessert").
	8.Find the Most Expensive Food Item: Identify and display the most expensive food item in the vector.
	9.Find the Cheapest Food Item: Identify and display the cheapest food item in the vector.
	10.Count Food Items in Each Category: Count and display the number of food items in each category.
*/

import java.util.*;

class Food {
    private int foodId;
    private String foodName;
    private double price;
    private String catagory;

    public Food(int foodId, String foodName, double price, String catagory) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.price = price;
        this.catagory = catagory;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }


    public int getFoodId() {
        return foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public double getPrice() {
        return price;
    }

    public String getCatagory() {
        return catagory;
    }
}

public class FoodManagement_22_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector<Food> v = new Vector();
        do {
            System.out.println("1.Add Food Items:");
            System.out.println("2.Display All Food Items:");
            System.out.println("3.Search Food by Name:");
            System.out.println("4.Update Food Price by ID:");
            System.out.println("5.Delete a Food Item by ID:");
            System.out.println("6.Sort Food Items by Price:");
            System.out.println("7.Filter Food by Category:");
            System.out.println("8.Find the Most Expensive Food Item:");
            System.out.println("9.Find the Cheapest Food Item:");
            System.out.println("10.Count Food Items in Each Category:");
            System.out.println("Leave Sysem");
            System.out.println("enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                   /* System.out.println("enter foodId");
                    f.setFoodId(sc.nextInt());
                    System.out.println("Enter name");
                    f.setFoodName(sc.next());
                    System.out.println("enter price");
                    f.setPrice(sc.nextDouble());
                    System.out.println("enter catagory");
                    f.setCatagory(sc.next());


                    */
                    System.out.println("enter food id \nname \nprice\ncatagary");
                    Food f = new Food(sc.nextInt(), sc.next(), sc.nextDouble(), sc.next());
                    v.add(f);
                    break;
                case 2:
                    Iterator i1 = v.iterator();

                    while (i1.hasNext()) {
                        Object obj = i1.next();
                        Food f1 = (Food) obj;
                        System.out.println("========================================");
                        System.out.println("food id           \t" + f1.getFoodId());
                        System.out.println("food name         \t" + f1.getFoodName());
                        System.out.println("food price        \t" + f1.getPrice());
                        System.out.println("food catagory     \t" + f1.getCatagory());
                    }
                    System.out.println("============================================");

                    break;
                case 3:
                    i1 = v.iterator();
                    System.out.println("enter food name");
                    String name = sc.next();
                    boolean flag = true;
                    System.out.println("========================================");

                    while (i1.hasNext()) {


                        Food f1 = (Food) i1.next();
                        System.out.println(f1.getFoodName());
                        if (f1.getFoodName().equals(name)) {
                            System.out.println("item found");
                            flag = false;
                            break;
                        }

                    }

                    if (flag)
                        System.out.println("food not found");
                    System.out.println("=========================================");

                    break;
                case 4:
                    i1 = v.iterator();
                    System.out.println("enter food id");
                    int id = sc.nextInt();
                    flag = true;
                    System.out.println("========================================");
                    while (i1.hasNext()) {
                        Object obj = i1.next();
                        Food f1 = (Food) obj;

                        if (f1.getFoodId() == id) {

                            flag = false;
                            System.out.println("enter new price");
                            f1.setPrice(sc.nextDouble());
                        }

                    }

                    if (flag)
                        System.out.println("food not found");
                    System.out.println("=========================================");
                    break;
                case 5:
                    i1 = v.iterator();
                    System.out.println("enter food id");
                    id = sc.nextInt();
                    flag = true;
                    System.out.println("========================================");
                    while (i1.hasNext()) {
                        Object obj = i1.next();
                        Food f1 = (Food) obj;
                        if (f1.getFoodId() == id) {
                            int index = v.indexOf(f1);
                            flag = false;
                            if (index != -1) {
                                v.remove(index);
                            }
                            break;
                        }

                    }

                    if (flag)
                        System.out.println("food not found");
                    System.out.println("=========================================");
                    break;
                case 6:
                    Collections.sort(v, Comparator.comparingDouble(Food::getPrice));
                    System.out.println("sorted");
                    break;
                case 7:
                    Collections.sort(v, Comparator.comparingDouble(Food::getPrice).reversed());
                    System.out.println("sorted");
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }

        } while (true);
    }
}
