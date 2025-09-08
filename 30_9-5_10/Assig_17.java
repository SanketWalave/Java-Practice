public class Assig_17
{
	public static void main(String  x[])
	{
		boolean flag=true;
		for(int i=1;i<=5;i++)
		{
			char ch=64;
			for(int j=1;j<=9;j++)
			{
				
				if(j>=i && j<=10-i && flag)
				{
					ch++;
					System.out.print(ch);
					flag=false;
				}
				else
				{
					System.out.print(" ");
					flag=true;
				}
			}
			System.out.println();
		}
	}
}