import java.util.*;
public class CourceAdmishionApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of frinds who want to take addmishion");
		int nn=sc.nextInt();
		System.out.println("enter the capacity of cource addmishion");
		int mm=sc.nextInt();
		System.out.println("enter number of student who alredy taken addmishion");
		int kk=sc.nextInt();
		if(mm-kk > nn)
			System.out.println("Yes");
		else
			System.out.println("No");			
	}
}