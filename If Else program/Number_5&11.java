import java.util.*;
public class Number_Divisible
{
	public static void main(String x[])
	{
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
    int number=sc.nextInt();
    if(number%5==0 && number%11==0)
	{
		System.out.println("number is divisible by 5 & 11");
	}		
	else
	{
		System.out.println("number is not divisible by 5 & 11");
	}
	}
}