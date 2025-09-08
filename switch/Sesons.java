import java.util.*;
public class Sesons
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter season");
		System.out.println("1.winter ");
		System.out.println("2.spring");
		System.out.println("3.Summer");
		System.out.println("4.fall");
		System.out.println("enter season you want to know");
		String season=sc.nextLine();
		
		switch(season){
			case "winter":
			System.out.println("december , janevary ,february");
			break ;
			case "spring" :
			System.out.println("march april may");
			break ;
			case "summer" :
			System.out.println("june , julai ,augast");
			break ;
			case "fall" :
			System.out.println("sep , oct ,nov");
			break ;
			default :
			System.out.println("invalid");
		}
		
	}
}