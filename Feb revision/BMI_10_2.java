/*7. BMI Calculator
Description: Write a program that calculates the Body Mass Index (BMI) of a person.
 Then categorize the result as "Underweight", "Normal weight", "Overweight", or "Obese" based on the BMI value using if-else statements.
Concepts Covered: if-else, conditional logic, input validation*/
import java.util.*;
public class BMI_10_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter waight of person");
		float weight=sc.nextFloat();
		System.out.println("Enter height of person");
		float height=sc.nextFloat();
		height/=100;
		float bmi=weight/height;
		
		if(bmi<18.5)
			System.out.println("Underweight");
		else if(bmi>=18.5 && bmi<=24.9)
			System.out.println("Normal weight");
		else
			System.out.println("over waight");
	}
}