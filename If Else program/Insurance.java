import java.util.*;
public class Insurance
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name");
        String name = sc.nextLine();
        System.out.println("Enter gender of employee (male/female)");
        String gender = sc.nextLine();
        System.out.println("Enter employee age");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter marital status of employee (maried/unmaried)");
        String status = sc.nextLine();
String result=
 (gender.equals("female") && age>25||gender.equals("male") && age>30||status.equals("marid"))?
 "insurance granted":"insurance not granted";
 System.out.println(result);
		
	//	if (gender.equals("female") && age>25||gender.equals("male") && age>30||status.equals("marid"))
	//	{
	//		System.out.println("Insurance granted");	
	//	}
//
//		else
//		{
///			System.out.println("Insurance not grantedgranted");
	//	}
	}
}