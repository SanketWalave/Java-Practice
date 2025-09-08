import java.util.*;
public class TemperatureSwitch
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		System.out.println("1.celsius to faranite");
		System.out.println("2.faranite to celsius");
		System.out.println("3.addition of two");
		System.out.println("4.substraction of two");
		System.out.println("5.multiplication of two");
		System.out.println("6.division of two");
		System.out.println("7.find graid of five ");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		int choice=sc.nextInt();
		int temp,cel,fah,num1,num2;
		switch (choice)
		{
			case 1:
			System.out.println("Enter temperature in celsius");
			temp=sc.nextInt();
			fah=(temp * 9 / 5) + 32;
			System.out.println("temperature in faranite is  "+ fah);
			String result=
			temp<0?"the freezing temperature":
		temp<10?"very cold wether":
        temp<20?"cold wether":
        temp<30?"normel temperature":
		temp<40?"its hot":"its very hot";
		System.out.println(result);
			break ;
			case 2:
			System.out.println("Enter temperature in faranite");
			temp=sc.nextInt();
			cel=(temp - 32) * 5 / 9;
			System.out.println("temperature in celsius is  "+ cel);
			break ;
			case 3:
			System.out.println("enter two number");
			num1=sc.nextInt();
			num2=sc.nextInt();
			int sum=num1+num2;
			System.out.println("sum is "+sum);
			break ;
			case 4:
			System.out.println("enter two number");
			num1=sc.nextInt();
			num2=sc.nextInt();
			int sub=num1-num2;
			System.out.println("sub is "+sub);
			break ;
			case 5:
			System.out.println("wnter two numbers");
			num1=sc.nextInt();
			num2=sc.nextInt();
			int multiplication=num1*num2;
			System.out.println("multiplication is  "+multiplication);
			break ;
			case 6:
			System.out.println("enter two numbers");
			num1=sc.nextInt();
			num2=sc.nextInt();
			int div=num1/num2;
			System.out.println("div is "+div);
			break ;
           default :
            System.out.println("temperature is invalid  ");
					   

		}
	}
}