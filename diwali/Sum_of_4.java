import java.util.*;
public class Sum_of_4
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		int len = a.length;
		System.out.println("Enter array element");
		for(int i=0;i<len;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Displayig array element");
		for(int i=0;i<len;i++)
		{
			System.out.print("\t"+a[i]);
		}
		System.out.println("Enter sket");
		int skey=sc.nextInt();
		
		
		int c1=0,c2=0,c3=0,c4=0;
		
		String [] strs = new String[len*4];
		int ele = 0;
		for(int i=0;i<len;i++)
		{
			c1++;
			for(int j=i+1;j<len;j++)
			{
				c2++;
				for(int k=j+1;k<len;k++)
				{
					c3++;
					for(int l=k+1;l<len;l++)
					{
						c4++;
						int sum=a[i]+a[j]+a[k]+a[l];
						System.out.println("          "+sum);
						  System.out.println("indexes   "+i+"   "+j+"   "+k+"    "+l);
						
					  if(a[i]+a[j]+a[k]+a[l]==skey)
					  {
						  System.out.println("   "+a[i]+"   "+a[j]+"   "+a[k]+"    "+a[l]);
						 /* String str = "   "+a[i]+"   "+a[j]+"   "+a[k]+"    "+a[l];
						  boolean flag = true;
						  for(int s=0; s<strs.length; s++){
							  if(strs[s]!=null && strs[s].equals(str)){
								flag = false;
							  }
						  }
						  
						  if(strs[ele]!=null && flag){
							  strs[ele] = str;
							  ele++;
						  }else{
							  flag = true;
						  }/*
						  break;
						  */
					  }
						
					}
				}
			}	
		}
	System.out.println("  1 "+c1);
	System.out.println("  2 "+c2);
	System.out.println("  3 "+c3);
	System.out.println("  4 "+c4);
		for(int i=0; i<strs.length; i++){
			if(strs[i]!=null){
				System.out.println(strs[i]);
			}
		}
	}
}