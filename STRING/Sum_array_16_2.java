/*Q11.Program to Find the Sum of Two Large Numbers.
Input  : str1 = "7777555511111111", 
             str2 =  "3332222221111"

Output : 7780887733332222
         1234567890123456
*/
import java.util.*;
public class Sum_array_16_2
{
	public static void main(String x[])
	{
		String str1="7777555511111111";
		String   str2="3332222221111";
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		char ch3[]=new char[str1.length()];
		int k=ch3.length;
		for(int i=ch1.length-1;i>=0;i--)
		{
			for(int j=ch2.length-1;j>=0;j--)
			{
				int sum=(ch1[i]-48)+(ch2[j]-48);
				if(sum<=9)
				{
					ch3[k]=(char)sum;
					k--;
				}
				else if(sum>9)
				{
					int rem=1;
					for(int a=1;a<=2;a++)
					{
						rem=sum%10;
						if(a==1)
						{
							ch3[k]=(char)rem;
							k--;
						}
					
						sum/=10;
					}
					ch1[i-1] = (char) ((ch1[i] - '0') + rem);

				}
			}
		}
		System.out.println("sum");
		for(int i=0;i<ch3.length;i++)
			System.out.println(ch3[i]);
	}
}