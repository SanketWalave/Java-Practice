import java.util.*;
public class AdultCheck
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
	    int time=sc.nextInt();
		String result=
		time<18?"not adult":"adult";
		System.out.println(result);
	}
}
