/*
Example1: WAP to create class name as Student with field id, name and sub [] So you have create 5 objects of student class
 and store data in it and calculate the percentage of every student and display and student should give 6 subjects exam 
*/
import java.util.*;
class Student
{
	private int id;
	private String name;
	private int sub[];
	void setId(int id)
	{
		this.id=id;
	}
	int getId()
	{
		return id;
	}
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	void setMarks(int sub[])
	{
		this.sub=sub;
	}
	double getMarks()
	{
		int sum=0;
		for(int i=0;i<sub.length;i++)
		{
			sum+=sub[i];
		}
		//int percentage=(double)sum/600*100;
		//return percentage ;
		return (double) sum / 600 * 100;
	}
}
class Student1
{
	Student s[];
	void stud(Student s[])
	{
		this.s=s;
	}
	void Display()
	{
		for(int i=0;i<s.length;i++)
		{
			System.out.println("\t"+s[i].getId()+"\tname->\t"+s[i].getName()+"\n\t percentage \t"+s[i].getMarks());
		}
	}
}

public class Student_ArrO
{
	public static void main(String x[])
	{
		
		 
		Student s[]=new Student[2];
		for(int i=0;i<s.length;i++)
		{
			s[i]=new Student();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id of Student");
			int id=sc.nextInt();
			System.out.println("Enter name of Student");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.println("Enter marks of Student");
			int a[]=new int[6];
			for(int j=0;j<a.length;j++)
			{
				a[j]=sc.nextInt();
			}
			s[i].setId(id);
			s[i].setName(name);
			s[i].setMarks(a);
			
			
		}
		Student1 s1=new Student1();
		s1.stud(s);
		s1.Display();
		
	}
}