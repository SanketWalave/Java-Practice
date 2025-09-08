import java.util.*;
public class Pattern_73
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row=sc.nextInt();
		int mid=row;
		int col=row*2,coll=col+1;
		for(int i=1;i<=row;i++)
		{
			int count=1;
			for(int j=1;j<=col;j++)
			{
				if(i>=j || j>=coll-i)
				{
					if(j<=mid)
					System.out.print(count++);
					else
					System.out.print(--count);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}