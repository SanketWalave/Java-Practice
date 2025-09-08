import java.util.*;
public class FindNumberIsDivisibleByFiveAndElevan
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  number");
		int num;
		num=sc.nextInt();
		
		if(num%5==0 && num%11==0)
		{
			System.out.println("Number  is divisible by 5 & 11");
		}
		
	    else{
			System.out.println("numbers is not divisible by 5 & 11");
		}
	}
}