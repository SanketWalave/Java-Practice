import java.util.*;
public class BasicSalaryApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter salary of employee\n");
		int salary=sc.nextInt();
		int hra,da,gross;
		if(salary<=10000)
		{
			hra=(salary*20)/100;
			da=(salary*80)/100;
			gross=hra+da+salary;
			System.out.println("gross salaray of employee id  ="+gross);
		}
		else if(salary<=20000)
		{
			hra=(salary*25)/100;
			da=(salary*90)/100;
			gross=hra+da+salary;
			System.out.println("gross salaray of employee id  ="+gross);
		}
	    else
		{
			hra=(salary*30)/100;
			da=(salary*95)/100;
			gross=hra+da+salary;
			System.out.println("gross salaray of employee id  ="+gross);
		}
	}
}