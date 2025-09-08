import java.util.*;
public class PercentageApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter marks of Physics, Chemistry, Biology, Mathematics and Computer");
        int phy=sc.nextInt();		
        int chem=sc.nextInt();		
        int bio=sc.nextInt();		
        int math=sc.nextInt();		
        int comp=sc.nextInt();
        int sum=phy+chem+bio+math+comp;
        int percentage=sum*100/500;
        System.out.println(percentage);
        String result=
		percentage >= 90? "Grade A": 
        percentage >= 80 ? "Grade B ":
        percentage >= 70 ? "Grade C ":
        percentage >= 60 ? "Grade D ":
        percentage >= 40 ? "Grade E ":
        percentage < 40 ?"Grade F ":"fail";
		System.out.println(result);
           		  
	}
}