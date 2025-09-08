import java.util.*;
public class MaximumBetweenNumber
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" your choice in hoe mwny numbers you want to find maximum ");
		System.out.println("1.two");
		System.out.println("2.three");
		System.out.println("3.four");
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		int num1,num2,num3,num4;
		switch(choice){
		 

	  case 1:
		num1=sc.nextInt();
		num2=sc.nextInt();
		if(num1>num2)
		{
			System.out.println("Number 1 is max");
		}
		else
		{
			System.out.println("Number 2 is max");
		}
		break ;
		
		  case 2:
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		if(num1>num2 && num1>num3)
		{
			System.out.println("Number 1 is max");
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("Number 2 is max");
		}
		else{
			System.out.println("number 3 is max");
		}
		break ;
		case 3:
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		num4=sc.nextInt();
		if(num1>num2 && num1>num3 && num1>num4)
		{
			System.out.println("Number 1 is max");
		}
		else if(num2>num1 && num2>num3 && num2>num4)
		{
			System.out.println("Number 2 is max");
		}
		else if(num3>num2 && num3>num1 && num3>num4)
		{
			System.out.println("number 3 is max");
		}
		else
		{
			System.out.println("number 4 is max");
		}
		break ;
		default :
		System.out.println("invalid number");
	}
}
}
