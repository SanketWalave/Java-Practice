import java.util.*;
public class NotsApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("enter amount\n");
		int amount=sc.nextInt();
		int notes;
		//int fivehundred,twohundred,hundred,fifty,twenty,ten,five,two,one;
		if(amount>=500)
		{
	           notes=amount/500;
			amount-=(notes*500);
			System.out.println("500= "+notes);
		}
		if(amount>=200)
		{
			notes=amount/200;
			amount-=(notes*200);
			System.out.println("200= "+notes);
		}
		if(amount>=100)
		{
			notes=amount/100;
			amount-=(notes*100);
			System.out.println("100= "+notes);
		}
		if(amount>=50)
		{
			notes=amount/50;
			amount-=(notes*50);
			System.out.println("50 = "+notes);
		}
		if(amount>=20)
		{
			notes=amount/20;
			amount-=(notes*20);
			System.out.println("20 = "+notes);
		}
		if(amount>=10)
		{
			notes=amount/10;
			amount-=(notes*10);
			System.out.println("10 = "+notes);
		}
		if(amount>=5)
		{
			notes=amount/5;
			amount-=(notes*5);
			System.out.println("5  = "+notes);
		}
		if(amount>=2)
		{
			notes=amount/2;
			amount-=(notes*2);
			System.out.println("2  = "+notes);
		}
		if(amount>=1)
		{
			notes=amount/1;
			
			System.out.println("1  = "+notes);
		}
		
		
	}
}