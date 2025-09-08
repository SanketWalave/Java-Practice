import java.util.*;
public class CheckTriangle2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three sides of triangle");
	/*	float angle1,angle2,angle3;
		angle1=sc.nextFloat();
		angle2=sc.nextFloat();
		angle3=sc.nextFloat();
		Float sum=angle1+angle2+angle3;
		if(sum==180)
		{
			System.out.println("triangle is valid");
		}
		else
		{
			System.out.println("triangle is not valid");
		}*/
		float side1,side2,side3;
		side1=sc.nextFloat();
		side2=sc.nextFloat();
		side3=sc.nextFloat();
	//	float sum=side1+side2;
	//	float sum2=side2+side3;
	//	float sum3=side1+side3;
		if((side1+side2>side3)&&(side1+side3>side2)&&(side3+side2>side1))
		{
			System.out.println("triangle is valid 1");
		}
	/*	else if(side1+side3>side2)
		{
			System.out.println("triangle is valid 2");
		}
		else if(side3+side2>side1)
		{
			System.out.println("triangle is valid 3");
		}*/
		else{
			System.out.println("triangle is not valid");
		}
	}
}