/*2. Create a Student class
Create a Student class with fields rollNo and marks.
Use the default constructor to assign a default roll number (1) and marks (75).
Add a method displayDetails() to print the student details.
Explanation: This ensures a strong grasp of constructors and how instance variables can hold unique values per object.
*/
class Student
{
	private int rollNo;
	private int marks;
	Student()
	{
		this.rollNo=1;
		this.marks=75;
	}
	void displayDatails()
	{
		System.out.println("Roll number of student\t"+rollNo);
		System.out.println("Marks of Student      \t"+marks);
	}
}
public class Student_17_1
{
	public static void main(String x[])
	{
		Student s=new Student();
		s.displayDatails();
	}
}