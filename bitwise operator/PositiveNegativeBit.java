import java.util.*;
public class PositiveNegativeBit
{
	public static void main(String x[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int num=sc.nextInt();
	//String result=((num >> 31) == 0)? "it is positive":"it is negative";
	//System.out.println(result);
	

if   ((num >> 31) == 0)/*The expression ((num >> 31) == 0) is a bitwise
 operation that checks the sign bit of a 32-bit integer num. Here's a breakdown:
- num >> 31:
    - Shifts the bits of num to the right by 31 places.
    - Effectively isolates the sign bit (most significant bit) of num.
- == 0:
    - Compares the result of the shift operation to 0.
    - If the result is 0, it means the sign bit was originally 0, indicating a positive number.
    - If the result is not 0 (-1 in two's complement representation), it means the sign bit was originally 1, indicating a negative number.

So, ((num >> 31) == 0) is a concise way to check if a number is positive (true) or negative (false) using bitwise operations.
*/

	{
		System.out.println("it is positive");
	}
	else
	{
		System.out.println("it is negative");
	}
}}
