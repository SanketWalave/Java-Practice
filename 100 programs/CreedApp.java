import java.util.*;
public class CreedApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter credit score");
		int xx=sc.nextInt();
		int yy=750;
		if(xx>yy)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}