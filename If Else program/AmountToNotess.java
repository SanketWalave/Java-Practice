import java.util.*;
public class AmountToNotess
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount");
		int amount=sc.nextInt();
		int fivehundred , twohundred , onehundred , fifty , twenty ,ten , five , two ,one;
		if(amount>=500)
		{
			fivehundred=amount/500;
			amount=amount-fivehundred*500;
			System.out.println("number of five hundred notes is  "+fivehundred);
		}
		if(amount>=200)
		{
			 twohundred=amount/200;
			 amount=amount-twohundred*200;
			 System.out.println("number of two hundred notes is  "+twohundred);
		}
		if(amount>=100)
		{
			 onehundred=amount/100;
			 amount=amount-onehundred*100;
			 System.out.println("number of one hundred notes is  "+onehundred);
		}
		if(amount>=50)
		{
			 fifty=amount/50;
			 amount=amount-fifty*50;
			 System.out.println("number of fifty  notes is  "+fifty);
		}
		if(amount>=20)
		{
			 twenty=amount/20;
			 amount=amount-twenty*20;
			 System.out.println("number of twenty notes is  "+twenty);
		}
		if(amount>=10)
		{
			 ten=amount/10;
			 amount=amount-ten*10;
			 System.out.println("number of 10 notes is  "+ten);
		}
		if(amount>=5)
		{
			 five=amount/5;
			 amount=amount-five*5;
			 System.out.println("number of five notes is  "+five);
		}
		if(amount>=2)
		{
			 two=amount/2;
			 amount=amount-two*2;
			 System.out.println("number of two  notes is  "+two);
		}
		if(amount>=1)
		{
			 one=amount/1;
			// amount=amount-twohundred*200;
			 System.out.println("number of one notes is  "+one);
		}
	}
}