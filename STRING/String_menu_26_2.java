/*Q.Write a menu-driven java program  to enter the string and following oprations.

input String :I am indian.

first ouput :  naidni ma I
	   
Secound output :  I ma naidni 
	   
Third outout : indian am I
	   
Fourth output : I am iNdiaN
	   
Fifth Output : I aM indiaN

*/
import java.util.*;
public class String_menu_26_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		String s="I am indian";
		String str=s;
		int choice =1;
		do{
		System.out.println("enter your hoice 1,2,3,4,5");
		
		
			switch(choice)
			{
				case 1:
				//System.out.println(s);
				   char ch[]=s.toCharArray();
				   int mid=ch.length/2;
				   int end=ch.length-1;
				   for(int i=0;i<mid;i++)
				   {
					   char temp=ch[i];
					   ch[i]=ch[end];ch[end]=temp;
					   end--;
				   }
				   s=new String(ch);
				   System.out.println(s);
				break;
				case 2:
				//System.out.println(s);
				s=str;
				     s=s+" ";
				    ch=s.toCharArray();
				   String w="";
				   s="";
				   for(int i=0;i<ch.length;i++)
				   {
					   if(ch[i]!=32)
					   {
						   w+=ch[i];
					   }
					   else
					   {
						  
						   char ch1[]=w.toCharArray();
						   mid=ch1.length/2;
							 end=ch1.length-1;
							for(int j=0;j<mid;j++)
							{
								char temp1=ch1[j];
								ch1[j]=ch1[end];
								ch1[end]=temp1;
								end--;
							}
							w="";
							for(int k=0;k<ch1.length;k++)
								w+=ch1[k];
							
							s=s+w+" ";
							w="";
					   }
					   
				   }
				  
				   System.out.println(s);
				   break;
				   case 3:
				      s=str;
					  s+=" ";
					  ch=s.toCharArray();
					  mid=ch.length/2;
					  end=ch.length-1;
					for(int i=0;i<mid;i++)
				   {
					   char temp=ch[i];
					   ch[i]=ch[end];ch[end]=temp;
					   end--;
				   }
				  
				   s="";
				   s=new String(ch);
				   s+=" ";
				   ch=s.toCharArray();
				   w="";
				   s="";
				   for(int i=0;i<ch.length;i++)
				   {
					   if(ch[i]!=32)
					   {
						   w+=ch[i];
					   }
					   else
					   {
						  
						   char ch1[]=w.toCharArray();
						   mid=ch1.length/2;
							 end=ch1.length-1;
							for(int j=0;j<mid;j++)
							{
								char temp1=ch1[j];
								ch1[j]=ch1[end];
								ch1[end]=temp1;
								end--;
							}
							w="";
							for(int k=0;k<ch1.length;k++)
								w+=ch1[k];
							
							s=s+w+" ";
							w="";
					   }
					   
				   }
				  
				   System.out.println(s);
				   
					  
				   break;
				case 4:
				   s=str;
				   ch=s.toCharArray();
				   for(int i=0;i<ch.length;i++)
				   {
					   if(ch[i]=='n')
					   {
						   ch[i]=(char)(ch[i]-32);
					   }
				   }
				   s="";
				   s=new String(ch);
				   System.out.println(s);
			   
				break;
				case 5:
				     s=str+" ";
					 ch=s.toCharArray();
					 for(int i=0;i<ch.length;i++)
					 {
						 if(ch[i]==32 && ch[i-1]>=97 && ch[i-1]<=122)
						 {
							 ch[i-1]=(char)(ch[i-1]-32);
						 }
					 }
					 s=new String(ch);
					 System.out.println(s);
				break;
				case 6:
				System.exit(0);
				break;
				default :
				System.out.println("invalid");
				break;
			}
			choice++;
		}while(true);
	}
}