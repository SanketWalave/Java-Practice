import java.util.*;
public class AllStrongNumberUptoN{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		for(int k=1;k<num;k++)
		{
		int temp = k;
		int fact = 1;
		int sum  = 0;
		while( temp !=0)// 1 4 5
		{	
			fact = 1;
			int rem = temp % 10;
			
		int  i = 1;
			 while( i <= rem )
			 {
				 fact = fact * i;
				  i++;
			 }
			
			sum=sum+fact;
			 temp /=10;
		}
		
			if(k == sum)
			{
			    System.out.println("It is strong number"+k);
			}

	}
	}
}