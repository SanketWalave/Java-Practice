/*

0        0 
01      01 
010    010 
0101  0101 
0101001010
-----------------
0        1
01      01
010    101
0101  0101
0101010101
*/

public class Pattern_55
{
  public static void main(String x[])
  {
    for(int i=1;i<=5;i++)
      {
        for(int j=1;j<=10;j++)
         {
           if(j<=i)
            {
                String res = (j%2==0) ? "1" : "0";
				System.out.print(res + " ");
            } 
            else if(j>=11-i)	
			{
				String res = (j%2==0) ? "0" : "1";
				System.out.print(res + " ");
			}
           else
            {
             System.out.print("  ");
            }  
         }
         System.out.println();
      }
  }
}