import java.util.*;
public class OddNumFun
{
	static int i=1;
	
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter limt of natural num");
		int limit=sc.nextInt();  // 10
		natural(limit);
		
	}
	public static void natural(int li)
	{
	
		if(i<=li)  // 11<=10
		{
			System.out.println(i);
			i+=2;
			natural(li);
		}
		
	}
}