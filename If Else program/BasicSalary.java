import java.util.*;
public class BasicSalary
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter basic salary of employee");
		float salary=sc.nextFloat();
		/*if(salary<10000)
		{
			float hra=salary*20/100f;
			float da=salary*80/100f;
			float finalsalary=salary+hra+da;
			System.out.println("final salary is  "+finalsalary);
		}
		if(salary<20000)
		{
			float hra=salary*25/100f;
			float da=salary*90/100f;
			float finalsalary=salary+hra+da;
			System.out.println("final salary is  "+finalsalary);
		}
		else
		{
			
			float hra=salary*30/100f;
			float da=salary*95/100f;
			float finalsalary=salary+hra+da;
			System.out.println("final salary is    "+finalsalary);
		}*/
		float hra = salary < 10000 ? salary * 20 / 100f : (salary < 20000 ? salary * 25 / 100f : salary * 30 / 100f);
        float da = salary < 10000 ? salary * 80 / 100f : (salary < 20000 ? salary * 90 / 100f : salary * 95 / 100f);
        float finalSalary = salary + hra + da;
		System.out.println("final salary is    "+ finalSalary);
	}
}