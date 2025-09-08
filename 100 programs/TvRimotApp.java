import java.util.*;
public class TvRimotApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first volume");
		int v1=sc.nextInt();
		System.out.println("enter second volume");
		int v2=sc.nextInt();
		int result=
		v1>v2?v1-v2:
		v2>v1?v2-v1:0;
		if(v1>v2)
		System.out.println(result +"  time button is pressed  to decrease volume");
	if(v2>v1)
		System.out.println(result +"  time button is pressed  to increase volume");
	}
}