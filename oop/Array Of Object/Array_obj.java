import java.util.*;
class Add
{
	private int num=0;
	private String name;
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	void steNum(int num)
	{
		this.num=num;
	}
	int getNum()
	{
		return num;
	}
		
	
}
public class Array_obj
{
	public static void main(String x[])
	{
		
		Add a[]=new Add[3];
		for(int i=0;i<a.length;i++)
		{
			Scanner xyz=new Scanner(System.in);
			a[i]=new Add();
			System.out.println("Enter name");
		 String pname=xyz.nextLine();
		  int pid=xyz.nextInt();
		  a[i].setName(pname);
		//  p[i].setId(pid);
			a[i].steNum(pid);
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\t\t"+a[i].getName()+"\t"+a[i].getNum());
		}
		
	}
}