import java.util.*;
public class PassFail
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter gread");
	    int gread=sc.nextInt();
	//	String result=
	//	gread<50?"fail":"pass";
	//	System.out.println(result);
	if(gread<50)
	{
		System.out.println("fail");
	}
	else
	{
		System.out.println("pass");
	}
	}
}
