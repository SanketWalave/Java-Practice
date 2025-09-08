/*
		A 
		A B A
		A B C B A
		A B C D C B A
		A B C D E D C B A

*/
public class Pattern_72
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			char ch='A';
			for(int j=1;j<=9;j++)
			{
				if(j<=i*2-1)
				{
					System.out.print(ch++);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	 for (int i = 1; i <= 5; i++) {
            char ch = 'A';

            // First loop: Print the increasing sequence and the decreasing sequence
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j <= i) {
                    // Print increasing part
                    System.out.print(ch++);
                } else {
                    // Print decreasing part
                    System.out.print(--ch);
                }
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}