import java.util.*;
public class NaturalInReverse
{
	static int i=0;
	
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter limt of natural num");
		int limit=sc.nextInt();  // 10
		natural(limit);
		
	}
	public static void natural(int li)
	{
	
		if(i<li)  // 11<=10
		{
			int num=li-i;
			System.out.println(num);
			i++;
			natural(li);
		}
		
	}
}