import java.util.*;
public class CheckPalidrome
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter four digit number");
		int num=sc.nextInt();
		int first, mid,last,third,second;
		last=num%10;
		third=(num/10)%10;
		second=(num/100)%10;
		first=num/1000;
	//	int sum=last+first;
	//	System.out.println(+last+""+third+""+second+""+first);
	if(first==last  && second==third)
	{
		System.out.println("number is palidrome");
	}
	else{
			System.out.println("number not  is palidrome");
	}
	}
}