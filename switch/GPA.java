import java.util.*;
public class GPA
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter graid");
		String ch=sc.nextLine();
		switch (ch){
			case "A":
			System.out.println(4.0);
			break ;
			case "B":
			System.out.println(3.0);
			break ;
			case "C":
			System.out.println(2.0);
			break ;
			case "D":
			System.out.println(1.0);
			break ;
			case "F":
			System.out.println(0.0);
			break ;
		}
	}
}