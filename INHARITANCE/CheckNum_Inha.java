import java.util.*;
class Number
{
	protected int num;
	void setValue(int num)
	{
		this.num=num;
	}
}
class CheckStrong extends Number
{
	boolean isStrong()
	{
		int temp=num,sum=0;
		for(;num>0;num/=10)
		{
			int rem=num%10;int mul=1;
			for(int j=1;j<=rem;j++)
			{
				mul*=j;
			}
			sum+=mul;
		}
		return (sum==temp);
	}
}
class CheckPrime extends Number
{
	boolean isPrime()
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		return (count==2);
	}
}
class CheckArmstrong extends Number
{
	boolean isArmstrong()
	{
		int temp=num,count=0;
		for(;temp>0;temp/=10)
			count++;
		
		temp=num ;int sum=0;
		for(;temp>0;temp/=10)
		{
			int rem=temp%10,power=1;
			for(int i=1;i<=count;i++)
			power*=rem;
		
			sum+=power;
		}
		
		return (sum==num);
	}
}
public class CheckNum_Inha
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		CheckStrong chs=new CheckStrong();
		chs.setValue(135);
		System.out.println("Check number is strong= "+chs.isStrong());

		CheckPrime chp=new CheckPrime();
		chp.setValue(12);
		System.out.println("Check number is prime= "+chp.isPrime());
		
		CheckArmstrong cha=new CheckArmstrong();
		cha.setValue(153);
		System.out.println("Check number is armstrong= "+cha.isArmstrong());
	}
}