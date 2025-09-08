import java.util.*;
public class AramstrongFunApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num,temp,count=0,rem=0,sum=0;
		num = sc.nextInt();
		temp = num;
		for(;temp != 0;temp /= 10)
		{
			count++;
			//heare we find how meny number present
		}
		temp = num;
		sum =  0;
		for(;temp != 0;temp /= 10)
		{
			rem = temp % 10;
			//heare we separet every digit of number
			int power = 1;
			for(int i = 1; i <= count ; i++)
				//in this loop we find power of every digit in number upto count
			{
				power = power * rem;
				/*
				if num=153
				count =3
				first rem=3
				power = power *3
				3=3*3
				9=9*3
				27=27*3
				*/
				
			}	
				sum = sum + power;	
                //heare we add every power in sum				
		}
						System.out.println("sum " + sum);

		if(num == sum)
		{
			System.out.println("it is Armstrong number");
		}
		else
		{
			System.out.println("it is not Armstrong number");
		}
	}
}