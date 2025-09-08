import java.util.*;
public class AddTwoAngle
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two angles");
	    float angle1=sc.nextInt();
	    float angle2=sc.nextInt();
		float sum=angle1+angle2;
		String result=
		sum<=180?"perfect angle":"not angle";
		System.out.println(result);
	}
}
