import java.util.*;
public class VovelCheckApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter alphabate");
		char ch=sc.next().charAt(0);
		String result=
		(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')?"vovel":
	    (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')?"vovel":"alphabate";
		System.out.println(result);
	}
}