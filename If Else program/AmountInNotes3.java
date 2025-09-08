import java.util.*;
public class AmountInNotes3
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount");
		int amount=sc.nextInt();
		int result=(amount>=500)?amount/500:0;
		amount=amount>=500?amount%500:amount;
		System.out.println(result);
		int result2=amount>=200?amount/200:0;
		amount=amount>=200?amount%200:amount;
		System.out.println(result2);
		int result3=amount>=100?amount/100:0;
		amount=amount>=100?amount%100:amount;
		System.out.println(result3);
  		int result4=amount>50?amount/50:0;
		amount=amount>=50?amount%50:amount;
		System.out.println(result4);
		int result5=amount>=20?amount/20:0;
		amount=amount>=20?amount%20:amount;
		System.out.println(result5);
		int result6=amount>=10?amount/10:0;
		amount=amount>=10?amount%10:amount;
		System.out.println(result6);
  		int resul7=amount>=5?amount/5:0;
		amount=amount>=5?amount%5:amount;
		System.out.println(resul7);
  		int result8=amount>=2?amount/2:0;
		amount=amount>=2?amount%2:amount;
		System.out.println(result8);
		int result9=amount>=1?amount/1:0;
		System.out.println(result9);
	}
}