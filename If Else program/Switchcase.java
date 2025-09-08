import java.util.*;

public class Switchcase
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabate");
		char ch = sc.next().charAt(0);
		
		switch (ch){
			case 'a':
			System.out.println("it is vowel ");
			break;

			case 'e':
			System.out.println("it is vowel ");
			break;	

			case 'i':
			System.out.println("it is vowel ");
				break;

			case 'o':
			System.out.println("it is vowel ");
				break;

			case 'u':
			System.out.println("it is vowel ");
				break;

			case 'A':
			System.out.println("it is vowel ");
				break;

			case 'E':
			System.out.println("it is vowel ");
				break;

			case 'I':
			System.out.println("it is vowel ");
				break;

			case 'O':
			System.out.println("it is vowel ");
				break;

			case 'U':
			System.out.println("it is vowel ");
				break;

			
			default:
			System.out.println("It is Conasonant");
		}
	}
}