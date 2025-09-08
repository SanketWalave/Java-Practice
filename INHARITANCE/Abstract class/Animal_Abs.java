import java.util.*;
abstract class Animal
{
	public abstract void sound();
	
}
class Dog extends Animal
{
	public void sound()
	{
		System.out.println("Bhow bhow");
	}
}
class Cat extends Animal
{
	public void sound()
	{
		System.out.println("mau mau");
	}
}
class karpe extends Animal
{
	public void sound()
	{
		System.out.println("ilu ilu aa");
	}
}
public class Animal_Abs
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		 
		Animal a=new Dog();
		a.sound();
		a=new Cat();
		a.sound();
		a=new karpe();
		a.sound();
	}
}