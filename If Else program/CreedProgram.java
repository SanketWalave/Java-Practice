/* To access CRED programs, one needs to have a credit score of 750750 or more.
Given that the present credit score is XX, determine if one can access CRED programs or not.
If it is possible to access CRED programs, output \text{YES}YES, otherwise output \text{NO}NO.
Input Format
The first and only line of input contains a single integer XX, the credit score.
Output Format
Print text{YES}YES if it is possible to access CRED programs. Otherwise, print \text{NO}NO.
You may print each character of the string in uppercase or lowercase (for example, the strings text{YeS}YeS, \texttt{yEs}yEs, \texttt{yes}yes and \texttt{YES}YES will all be treated as identical).

*/
import java.util.*;
public class CreedProgram
{
	public static void main(String x[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter obtain marks");
	int marksobtain=sc.nextInt();
	int requirdmarks=750750;
	System.out.println("requird marks "+ requirdmarks);
	//String result=(marksobtain>requirdmarks)?"you can teck addmishion":"you canot take addmishion";
	//System.out.println(result);
	if(marksobtain<requirdmarks)
	{
		System.out.println("you can't take addmishion");
		int markrequired=requirdmarks-marksobtain;
		System.out.println("you required "+markrequired+" more marks to get addmishion");
	}
	else
	{
		System.out.println("you can take addmishion");
	}
	
	
	}
}