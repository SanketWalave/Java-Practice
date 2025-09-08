import java.util.*;
public class UpperLowerApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter alphabate");
		char ch=sc.next().charAt(0);
		  sc.close();
		if(ch>='a' && ch<='z')
		{
			System.out.println("lower case");
		}
		else if(ch>='A' && ch<='Z')
		{
			System.out.println("upper  case");
		}
		else
		{
			System.out.println("not alphabate");
		}
		/*
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower case");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Upper case");
        } else {
            System.out.println("Not an alphabet");
        }

*/
		
	}
}