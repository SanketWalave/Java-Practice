import java.util.*;
class Add
{
  private int a,b,c;
  private Scanner xyz  = new Scanner(System.in);
  
  void setValue()
  { System.out.println("Enter two values");
     a=xyz.nextInt();
	 b=xyz.nextInt();
  }
  void calAdd()
  { c=a+b;
     System.out.printf("Addition is %d\n",c);
  }
}
public class AddApp
{  public static void main(String x[])
   {
	  Add ad = new Add();
	   ad.setValue();
	   ad.calAdd();
   }
}
