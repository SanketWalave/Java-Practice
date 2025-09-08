/*.Write a  program to input marks of five subjects Physics, Chemistry, Biology,
 Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >*/

import java.util.*;
public class GradeSystem
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of subjects");
		System.out.println("physics");
		float physics=sc.nextFloat();
		System.out.println("chemistry");
		float chemistry=sc.nextFloat();
		System.out.println("biology");
		float biology=sc.nextFloat();
		System.out.println("math");
		float math=sc.nextFloat();
		System.out.println("computer");
		float computer=sc.nextFloat();
		float total=physics+chemistry+biology+math+computer;
		float percentage=total*100/500;
		System.out.println(percentage);
		/*String graid=
		percentage>=90?"graid A":
		percentage>80?"graid b":
		percentage>70?"graid c":
		percentage>60?"graid d":
		percentage>40?"graid e":
		"graid f";
		System.out.println(graid);
		*/
		if(percentage>90)
		{
			System.out.println("graid A");
		}
		if(percentage>80)
		{
			System.out.println("graid B");
		}
		if(percentage>70)
		{
			System.out.println("graid C");
		}
		if(percentage>60)
		{
			System.out.println("graid D");
		}
		if(percentage>40)
		{
			System.out.println("graid E    dffaf");
		}
		else
		{
			System.out.println("Graid f");
		}
		
	}
}