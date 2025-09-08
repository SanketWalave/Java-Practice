/*Write a java program to swap to first two digit & last two digit of a number.
	Input : 12345
	Output : 45312

*/
import java.util.*;
public class Swap_First2_Last2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter more than four digit number");
		int num=sc.nextInt();
		
		
		int count=0,temp=num,firsttwo,lasttwo;
		for(;temp>0;temp/=10)
			count++;
		
		if(count==4)
		{
			firsttwo=num/100;
			lasttwo=num%100;
			System.out.println(firsttwo);
			System.out.println(lasttwo);
			num=lasttwo*100+firsttwo;
			System.out.println("nuumber =\t"+num);
		}
		else if(count==5)
		{
			firsttwo=num/1000;
			lasttwo=num%100;
			int middle = (num / 100) % 10;
			System.out.println(firsttwo);
			System.out.println(lasttwo);
			System.out.println(middle);
			
			num=lasttwo*1000+middle*100+firsttwo;
			

			System.out.println("nuumber =\t"+num);
		}
		else if(count==6)
		{
			firsttwo=num/10000;
			lasttwo=num%100;
			int middle = (num / 100) % 100;
			System.out.println(firsttwo);
			System.out.println(lasttwo);
			System.out.println(middle);
			
			num=lasttwo*10000+middle*100+firsttwo;
			

			System.out.println("nuumber =\t"+num);
		}
	}
}