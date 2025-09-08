import java.util.*;
public class IqTestApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter iq of chef");
		int nn=sc.nextInt();
		
		if(nn+7 > 170)
			System.out.println("Yes");
		else
			System.out.println("No");			
	}
}