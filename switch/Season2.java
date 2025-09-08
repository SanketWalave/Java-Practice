import java.util.*;
public class Season2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter month ");
		int month=sc.nextInt();
		
		switch (month){
			case 1:
			System.out.println("winter");
			break ;
			case 2:
			System.out.println("winter");
			break ;
			case 3:
			System.out.println("spring");
			break ;
			case 4:
			System.out.println("spring");
			break ;
			case 5:
			System.out.println("spring");
			break ;
			case 6:
			System.out.println("summer");
			break ;
			case 7:
			System.out.println("summer");
			break ;
			case 8:
			System.out.println("summer");
			break ;
			case 9:
			System.out.println("fall");
			break ;
			case 10:
			System.out.println("fall");
			break ;
			case 11:
			System.out.println("fall");
			break ;
			case 12:
			System.out.println("winter");
			break ;
			default :
			System.out.println("invalid month");
		}
	}
}