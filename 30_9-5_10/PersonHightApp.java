import java.util.*;
public class PersonHightApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter persons heght");
		float height=sc.nextFloat();
		if(height<150.00f)
			System.out.println("person is dwarf");
		else if(height>=155.0f && height<=165.0f)
			System.out.println("person is avearage height");
		else if(height>=165.0f && height<=195.0f)
			System.out.println("person is taler");
	}
}