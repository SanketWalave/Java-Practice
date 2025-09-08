public class AlphabateFunRe
{
	public static void main(String x[])
	{
		char cha='A';
		alpha(cha);
	}
	public static void alpha(char ch)
	{
		if(ch<='Z')
		{
			System.out.print(ch+"\t");
			ch++;
			alpha(ch);
		}
	}
}