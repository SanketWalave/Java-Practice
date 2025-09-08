import java.util.*;
public class AmountInNotes
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount");
		int amount=sc.nextInt();
		int am1,am2,am3,am4,am5,am6,am7,am8,am9,am10,am11,am12,am13,am14,am15,am16,am17;
		am1=amount/500;
		am2=amount%500;
		System.out.println("number of five hundred notes is "+am1);
		am3=am2/200;
		am4=am2%200;
		System.out.println("number of two hundred notes is "+am3);
		am5=am4/100;
		am6=am5%100;
		System.out.println("number of one hundred notes is "+am5);
		am7=am6/50;
		am8=am7%50;
		System.out.println("number of fifty rupee notes is "+am7);
		am9=am8/20;
		am10=am9%20;
		System.out.println("number of twenty rupee notes is "+am9);
		am11=am10/10;
		am12=am11%10;
		System.out.println("number of  ten rupee notes is "+am11);
		am13=am12/5;
		am14=am13%5;
		System.out.println("number of five rupee coin is "+am13);
		am15=am14/2;
		am16=am14%2;
		System.out.println("number of two rupee coin is "+am15);
		am17=am16/1;
		System.out.println("number of one rupee coin is "+am17);
	}
}