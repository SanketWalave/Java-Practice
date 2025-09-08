/*Problem
Ezio can manipulate at most XX number of guards with the apple of Eden.
Given that there are YY number of guards, predict if he can safely manipulate all of them.
Input Format
First line will contain TT, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, two integers XX and YY.
Output Format
For each test case, print text {YES} YES if it is possible for Ezio to manipulate all the guards. Otherwise, print  text {NO} NO.

You may print each character of the string in uppercase or lowercase 
(For example, the strings text {Yes} YeS, text {yEs} yEs, \text {yes}yes and \text {YES}YES will all be treated as identical).
*/
import java.util.*;
public class Guardsmanupilation
{
	public static void  main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of apple");
		int xx=sc.nextInt();
		System.out.println("enter number of gards");
		int yy=sc.nextInt();
		//String result=xx<yy?"NO":"YES";
		//System.out.println(result);
		if (xx<yy)
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("YES");
		}
	}
}