import java.util.*;
public class AppleGardsApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of gards ezio can manupulate");
		int xx=sc.nextInt();
		System.out.println("total number of gards present");
		int yy=sc.nextInt();
		if(xx>yy)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}