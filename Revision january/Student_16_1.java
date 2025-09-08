/*3. Create a Student class with attributes name, rollNumber, and marks. Use a constructor to initialize the values and
 write a method to display whether the student has passed (marks > 40).
Explanation: This problem will help you implement logic within a constructor and a method based on conditions.
*/
class Student
{
	private String name;
	private int rollNumber;
	private int marks;
	Student(String name,int rollNumber,int marks)
	{
		this.name=name;
		this.rollNumber=rollNumber;
		this.marks=marks;
	}
	boolean isPass()
	{
		System.out.println("Student name       \t"+name);
		System.out.println("Student roll Number\t"+rollNumber);
		System.out.println("Student marks      \t"+marks);

		return marks>40;
	}
}
public class Student_16_1
{
	public static void main(String x[])
	{
		Student s=new Student("sanket",88,70);
		String res=s.isPass()?"pass":"fail";
		System.out.println("result\t:"+res);
	}
}