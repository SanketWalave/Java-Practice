import java.util.*; 
public class PerfectNumber
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
				
		}
		if(sum==num)
			System.out.println("number is perfect");
		else
			System.out.println("number is not perfect");
	}
}