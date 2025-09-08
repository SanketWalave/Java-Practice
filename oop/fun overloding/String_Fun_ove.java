/*Q.2. Write a program to create function name as register 
void register(String studName,int age , String schoolName,int fees)
void register(String voterName,int age,String wardName)
*/

import java.util.*;
public class String_Fun_ove
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		String stname,schname,voname,waname;
		int stage,schfees,voage;
		System.out.println("Enter student name");
		stname=sc.nextLine();
		System.out.println("Enter student age");
		stage=sc.nextInt();
		System.out.println("\nEnter school name");
		sc.nextLine();
		schname=sc.nextLine();
		System.out.println("Enter school fees name");
		schfees=sc.nextInt();
		
		register(stname,stage,schname,schfees);
		
		System.out.println("Enter voter name");
		sc.nextLine();
		voname=sc.nextLine();
		System.out.println("Enter student age");
		voage=sc.nextInt();
		System.out.println("\nEnter school name");
		sc.nextLine();
		waname=sc.nextLine();
		register(voname,voage,waname);
	}
	public static void register(String studName,int age , String schoolName,int fees)
	{
		System.out.println(studName);
		System.out.println(age);
		System.out.println(schoolName);
		System.out.println(fees);
	}
	public static void register(String voterName,int age,String wardName)
	{
		System.out.println(voterName);
		System.out.println(age);
		System.out.println(wardName);
	}
}