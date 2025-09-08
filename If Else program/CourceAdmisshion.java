/*Problem
There is a group of NN friends who wish to enroll in a course together. The course has a maximum capacity of MM students that can register for it. If there are KK other students who have already enrolled in the course, determine if it will still be possible for all the NN friends to do so or not.
Input Format
•	The first line contains a single integer TT - the number of test cases. Then the test cases follow.
•	Each test case consists of a single line containing three integers NN, MM and KK - the size of the friend group, the capacity of the course and the number of students already registered for the course.
*/
import java.util.*;
public class CourceAdmisshion
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter capacity of admishions");
		int mm=sc.nextInt();
		System.out.println("enter student number who alredy taken addmishion");
		int kk=sc.nextInt();
		System.out.println("enter numberof friends who want to take addmishion");
		int nn=sc.nextInt();
		int remainadd=mm-kk;
	//	String result=remainadd>nn?"all friends get addmishion":"all friens will not get addmishion";
	//	System.out.println(result);
	if (remainadd>nn)
	{
		System.out.println("all friends get addmishion");
	}
	else
	{
		System.out.println("all frends will not get addmishion");
		System.out.println("only " +remainadd+" no of frends will  get addmishion");
		
	}
	}
}