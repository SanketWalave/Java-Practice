import java.util.*;
public class ElectricityBill
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter custemer id");
		int idnum=sc.nextInt();
		System.out.println("enter custemer name");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter units consumed by custemer");
        int units=sc.nextInt();
		float bill;
    /*  if(units<=199)
	  {
		  bill=units*1.20f;
		 System.out.println("bill is   "+bill);
	  }	
	  
	  if(units<400)
		{
		  bill=units*1.50f;
		  System.out.println("bill is  "+bill);
	 
	  }
	  if(units<600)
		{
		   bill=units*1.80f;
		  System.out.println("bill is   "+ bill);
		}
	  else 
	  {           bill=units*2.0f;
		  		  System.out.println("bill is   "+ bill);
	  }
	  
	  if (bill > 400f)
	  {
		  float surcharge=(bill*15/100f);
		  float finalbill = surcharge + bill;
		  System.out.println(finalbill);
	  }*/
	  
	  float result=
	  units<=199?units*1.20f:
	  units<400?units*1.40f:
	  units<600?units*1.80f:
	  units*2.0f;
	  System.out.println(result);
	  float finalbill=result>400?finalbill=result*15/100f:result;
	  System.out.println(result+finalbill);
	  
	}
}