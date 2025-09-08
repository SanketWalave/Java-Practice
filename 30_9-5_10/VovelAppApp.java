import java.util.*;
public class VovelAppApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter alphabate");
		char ch=sc.next().charAt(0);
		if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A' ||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			System.out.println(" alphabate is vowel");
		else
			System.out.println(" alphabate is consonent");
	}
}