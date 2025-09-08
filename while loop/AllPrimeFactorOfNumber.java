import java.util.*;
 public class Prime_Fact
 {
 public static void main(String args[])
 {
	Scanner sc= new Scanner(System.in);
     System.out.println("Enter the number to find its Prime Factor");
      int num=sc.nextInt();	
	  int i=1,j=1,count=0;
       while(num>i)
	   {
		   if(num%i==0)
		   { j=1;
	         count=0;
			   while(i>j)
			   {
				 if(i%j==0)
				 {
					 count++;
					 
				 } 	
                  j++; 				 
				   
			   }
			   if(count==2)
			   {
				   System.out.println("-->"+i);
				   
			   }
			   
		   }
		   
		   i++;
	   }		   
	 
	 
 }
 }