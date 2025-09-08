import java.util.*;
public class CandiiApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter candis in jar");
		int n=sc.nextInt();
		System.out.println("enter nu of candis surve");
		int m=sc.nextInt();
		System.out.println("alwas left candis number");
		int k=sc.nextInt();
		if(n>m)
		{
			System.out.println(m+" candis are surved");
			System.out.println(n-m+" candis left in jar");
		}
		else if(n<m)
			System.out.println("invalid ");
		
	}
}