/*Example1: WAP to create class name as Square with two functions 
void acceptNumber(): this function can accept number from keyboard 
void showSquare(): this function can calculate square of number and display it.
*/
import java.util.*;
class Square
{
    private int num,square;
	private Scanner sc=new Scanner(System.in);
	void acceptNumber()
	{
		System.out.println("enter number");
		num=sc.nextInt();
	}
	void showSquare()
	{
		System.out.println("Square is --->"+num*num);
	}
}
public class Square_class
{
	public static void main(String x[])
	{
		Square sq= new Square();
		sq.acceptNumber();
		sq.showSquare();
	}
}