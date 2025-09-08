import java.util.*;
class cube
{
    private int num,cube;
	private Scanner sc=new Scanner(System.in);
	void acceptNumber()
	{
		System.out.println("enter number");
		num=sc.nextInt();
	}
	void showcube()
	{
		System.out.println("cube is --->"+num*num*num);
	}
}
public class cube_class
{
	public static void main(String x[])
	{
		cube cb= new cube();
		cb.acceptNumber();
		cb.showcube();
	}
}