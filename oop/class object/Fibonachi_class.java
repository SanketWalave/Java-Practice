/*Q5.  WAP to create class name as Fibo with two functions 
  void setLimit(int limit): this function can set the limit of series 
  void showFibo(): this function can display the fibonacci series*/
  
  import java.util.*;
  class Fibo
  {
	private int li;
    void setLimit(int limit)
	{
		li=limit;
	}	
	void fibo()
	{
		int i,j,f1=0,f2=1,fib;
		for(i=1;i<=li;i++)
		{
			fib=f1+f2;
			f1=f2;
			f2=fib;
			System.out.println(fib);
		}
	}
  }
  public class Fibonachi_class
  {
	  public static void main(String x[])
	  {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Limit");
			int limit=sc.nextInt();
			Fibo fi=new Fibo();
			fi.setLimit(limit);
			fi.fibo();
		  
	  }
  }