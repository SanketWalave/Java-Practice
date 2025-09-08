import java.util.*;
public class Power
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base");
		int base = sc.nextInt();
		
		System.out.println("Enter the index");
		int index = sc.nextInt();
		
		int p = 1;
		int i = 1;
		while(i <= index)//4
		{
			p = p * base; 
			i++;
		}
		
		System.out.println("Power---->"+p);
	}
}