import java.util.*;
public class Hight
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter hight of person");
		int hight=sc.nextInt();
		if(hight<150)
		{
			System.out.println("the person is dwarf");
		}
		else if (hight>=150 && hight<165)
		{
			System.out.println("the person has normal hight");
		}
		else if (hight>=165 && hight<195)
		{
			System.out.println("person is taller");
		}
		else{
			System.out.println("not human");
		}
	}
}