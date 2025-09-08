import java.util.*;
public class FrequencyOfNumberInDigit
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int i=0,num1,freq=0;
	    System.out.println("enter number");
		num1=sc.nextInt();
		
		while(i<=9)
		{
		while(num>0)
		{
			if(num%10==num1)
			{
				freq++;
			}
			 num=num/10;
		}
		if(freq==0){
		System.out.println("frequency of 1 "+freq);
		}
		if(freq==1){
		System.out.println("frequency of 1 "+freq);
		}
		if(freq==2){
		System.out.println("frequency of 1 "+freq);
		}
		if(freq==3){
		System.out.println("frequency of 1 "+freq);
		}
		if(freq==4){
		System.out.println("frequency of 1 "+freq);
		}
		if(freq==5){
		System.out.println("frequency of 1 "+freq);
		}
		if(freq==6){
		System.out.println("frequency of 1 "+freq);
		}
		if(freq==7){
		System.out.println("frequency of 1 "+freq);
		}
		if(freq==8){
		System.out.println("frequency of 1 "+freq);
		}
		if(freq==9){
		System.out.println("frequency of 1 "+freq);
		}
		i++;
		}
	}
}