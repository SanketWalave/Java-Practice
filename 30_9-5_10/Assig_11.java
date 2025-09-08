import java.util.*;
public class Assig_11
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter your choice \n1\n2\n3\n4\n5");
		int choice =sc.nextInt();
		int i,j;
		switch(choice)
		{
			case 1:
				for( i  = 1 ; i <=6 ;i++)
				{
					System.out.print( i + " "+ i * 2 + " ");
				}
			break;
			case 2:
				for(i=1;i<=9;i++)
				 {
					System.out.print( i * 2 + " "+ (10-i) * (10 - i) * (10 - i) + " ");
				 }
			break ;
			case 3:
			     for(i=1;i<=10;i++)
				 {
					System.out.print(i*i+" "); 
				 }
			break;
			case 4:
			
			break ;
			case 5:
			for(i=1;i<=15;i++)
			{
				if(i <=8)
				{
					System.out.print(i*5+" "+i*3+" 	");
				}
			}
			
			
		}
	}
}