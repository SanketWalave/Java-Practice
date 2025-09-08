import java.util.*;
public class TempCheck
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int temp=sc.nextInt();
		/*String result=
		temp<0?"the freezing temperature":
		temp<10?"very cold wether":
        temp<20?"cold wether":
        temp<30?"normel temperature":
		temp<40?"its hot":"its very hot";
		System.out.println(result);*/
		if(temp<0)
		{
			System.out.println("freesing weather");
		}
		else if(temp<10)
		{
	    	System.out.println("very cold weather");
		}
		else if(temp<20)
		{
			System.out.println("cold weather");
		}
		else if(temp<30)
		{
			System.out.println("normal temp");
		}
		else if(temp<40)
		{
			System.out.println("its hot");
		}
		else{
						System.out.println("its very hot");
		}
	}
}