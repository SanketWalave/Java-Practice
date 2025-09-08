public class Pattern_00
{   public static void main(String x[])throws Exception
   {    for(int i=1; i<=10;i++)
	{
	   for(int j=2; j<=10; j++)
	   {
	     System.out.printf("%d\t",i*j);
	      Thread.sleep(100);
	   }
	System.out.printf("\n");
	}
   }
}
