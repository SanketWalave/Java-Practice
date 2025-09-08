/*
A study has shown that playing a musical instrument helps in increasing one's IQ by 77 points. Chef knows he can't beat Einstein in physics, but he wants to try to beat him in an IQ competition.
You know that Einstein had an IQ of 170170, and Chef currently has an IQ of XX.
Determine if, after learning to play a musical instrument, Chef's IQ will become strictly greater than Einstein's
*/
import java.util.*;
public class Iqtest
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter IQ of chef");
		int iqchef=sc.nextInt();
		System.out.println("enter no of music classes attend");
		int music=77;
		int musicnum=sc.nextInt();
		int iqincrement=music*musicnum;
		int iqafmusic=iqchef+iqincrement;
		if(170170<iqafmusic)
		{
			System.out.println("chef can beat ainstian");
			//int iqneed=190-iqafmusic;
			//System.out.println("iq need more to beet ainstian is "+iqneed);


		}
		else
		{
			System.out.println("chef can't beat ainstian");
			int iqneed=190-iqafmusic;
			System.out.println("iq need more to beet ainstian is "+iqneed);

		}
	}
}/*
		String result=iqafmusic>190?"chef can beat ainstian":"chef can't beat ainstian";
		System.out.println(result);
		int iqneed=190-iqafmusic;
		System.out.println("iq need more to beet ainstian is "+iqneed);
	}
}*/