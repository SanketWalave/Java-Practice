import java.util.*;
public class AlphabetCheck
{
	public static void main(String x[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter alphabate");
	  char alphabate = sc.next().charAt(0);

	
	if(alphabate=='a'||alphabate=='e'||alphabate=='e'||alphabate=='i'||alphabate=='o'||alphabate=='u')
	{
		System.out.println("alphabate is ovel");
	}
	else
	{
		System.out.println("alphabate is Consonant");
	}
	
	}
}