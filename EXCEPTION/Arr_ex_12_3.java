public class Arr_ex_12_3
{
	public static void main (String x[])
	{
		try{
		int a[]={1,2,3,4,5};
		for(int i=0;i<=a.length;i++)
			System.out.print("\t"+a[i]);
		}
		catch(Exception ex)
		{
			System.out.println("\n"+ex);
		}
	}
}