import java.util.*;
public class Palidrome
{
    public static void main(String x[])
	   {
	      Scanner xyz=new Scanner(System.in);
		  int no,temp,rem,rev=0;
		  System.out.println("Enter the number");
		  no=xyz.nextInt();
		  temp=no;
		//  int sum1 = (no%10);
        // int sum2= ((no/10)%10);
        // int sum3=(no/100);
		  rem=no%10;  //222%10=2
		  rev=rev*10+rem;//2*10+re=202
		  no=no/10;
		  
		  rem=no%10;
		  rev=rev*10+rem;
		  no=no/10;
		  
		  rem=no%10;
		  rev=rev*10+rem;
		// String result=(sum1==sum2) && (sum2==sum3)?"palidrome":"not palidrome";	
		// System.out.println(result);
		
		//or 

		// String result=(no%10==(no/10)%10 && (no/10)%10==no/100)?"Palindrome":"Not Palindrome";
		 //System.out.println(result);
		
		//or
		
		  //  String result=(temp==rev)?"Palindrome":"Not Palindrome";
		 //System.out.println(result);
		  
		  //or
		  
		/* if(no%10==(no/10)%10 && (no/10)%10==no/100)
		 {
			 System.out.println("palidrome");
		 }
		 else
		 {
			 System.out.println("not palidrome");
		 }*/
		 
		 // or
		 
		  if(temp==rev)
		 {
			 System.out.println("palidrome");
		 }
		 else
		 {
			 System.out.println("not palidrome");
		 }
		 }
		 }
		 