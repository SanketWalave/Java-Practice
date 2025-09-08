import java.util.*;
public class RightAngleTriangle
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sides of triangle");
		int side1=sc.nextInt();
		int side2=sc.nextInt();
		int side3=sc.nextInt();
		
		int squareof2=side1*side1 + side2*side2;
		 int squareof3=side3*side3;
		 int squareof4=side1*side1 + side3*side3;
		 int squareof5=side2*side2;
		 int squareof6=side3*side3 + side2*side2;
		 int squareof7=side1*side1;
	   String result=
	  (squareof3 == squareof2) ?"right angle triangle":
	  (squareof5 == squareof4) ?"right angle triangle":
	  (squareof7 == squareof6) ?"right angle triangle":
	  "not right angle triangle";
	   System.out.println(result);
	   /*
	    int squareof3=side3*side3;
		 int squareof2=side2*side2;
		 int squareof1=side1*side1;
	   String result=
	  (squareof3 == squareof2+squareof1) ?"right angle triangle":
	  (squareof2 ==squareof3+squareof1) ?"right angle triangle":
	  (squareof1 ==squareof2+squareof3) ?"right angle triangle":
	  "not right angle triangle";*/
	}
}