import java.util.*;
public class DigitCount_12_1
{
	static int count=0;	
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter number");
		int num=sc.nextInt();
		int res=DigitCount(num);
		System.out.println("\t\t"+res);
		
	}
	public static int DigitCount(int num)
	{
		
		if(num>0)
		{
			count++;
			
			num/=10;
			DigitCount(num);
		}
		
		return count;
	}
}