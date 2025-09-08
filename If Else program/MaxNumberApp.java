import java.util.*;
 
 public class MaxNumberApp
 {
		public static void main(String arg[])
		{
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter Two numbers ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a > b)
			{
				System.out.println(a + " is greater");
			}
				else
				{
					System.out.println(b + " is greater");
				}
			
		}
 }
 