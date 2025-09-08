import java.util.*;
public class TemperatureSc
{
  public static void main(String x[])
  {
    Scanner xyz=new Scanner (System.in);
	float cel,fah;
	
	System.out.println("Enter temperature in cel");
	cel=xyz.nextFloat();
	fah=(cel*9/5f)+32f;
	System.out.println("temperature in feh is--> " + fah);
  }
}