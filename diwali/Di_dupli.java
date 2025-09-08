import java.util.*;
public class Di_dupli
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		sc.nextLine();
		char a[]=new char[size];
		System.out.println("Enter element in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextLine().charAt(0);
		}
		System.out.println("Displaying arry before operation");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			boolean flag=false;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					flag=true;
					a[i]=a[j];
					break ;
				}
			}
			if(flag)
				size--;
		}
		System.out.println("\nDisplaying arry after operation");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}
		
		
	}
}
/*  // Remove duplicates
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    // Shift elements to fill the gap
                    for (int k = j; k < a.length - 1; k++) {
                        a[k] = a[k + 1];
                    }
                    size--; // Decrease array size
                    j--; // Re-check current position
                }
            }
        }
*/