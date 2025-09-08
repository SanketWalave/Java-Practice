import java.util.*;
public class CabApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int xx,yy;
		System.out.println("Enter first cab cervice cost");
		xx=sc.nextInt();
		System.out.println("Enter second cab cervice cost");
		yy=sc.nextInt();
		String result=
		xx<yy?"take first":
		xx>yy?"take second":"take any";
		System.out.println(result);
	}
}