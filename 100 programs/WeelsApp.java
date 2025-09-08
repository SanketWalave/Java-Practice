import java.util.*;
public class WeelsApp
{
	public static void main(String x[])
	{
		Scanner input=new Scanner(System.in);
		int num;
		System.out.println("Enter a number vehicles");
		int v=input.nextInt();
		System.out.println("Enter a number wheels");
		int w=input.nextInt();
			
			if(2<=w && w%2==0 && v<w)
			{
				// Solve for TW (Two-wheelers)
					int FW = (w - 2 * v) / 2;
					int TW = v - FW;
					System.out.println("TW = " + TW + " FW = " + FW);
			}
			
			else{
				System.out.println("INVALID INPUT");
			}
	}
}