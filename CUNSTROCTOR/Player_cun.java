/*
8. Player Score Tracking
Task: Create a Player class with fields playerName, matchesPlayed, and score. Implement a constructor for initialization.
 In another class Game, create an array of Player objects and write a method to print score
•	Explanation: The Player class holds the player’s data, and Game performs the logic to find the top scorer.
*/
import java.util.*;
class Player
{
	private String pname;
	private int mplayed;
	private int score;
	Player(int mplayed)
	{
		//this.pname=pname;
		this.mplayed=mplayed;
		//this.score=score;
	}
	void setName(String pname)
	{
		this.pname=pname;
	}
	String getPname()
	{
		return pname;
	}
	void setMachPlayed(int mplayed)
	{
		this.mplayed=mplayed;
	}
	int getMachPlayed()
	{
		return mplayed;
	}
	void setScore(int score)
	{
		this.score=score;
	}
	int getScore()
	{
		return score;
	}
}
//--------------------------------------------------------------------------------
class Game
{
	private Player p[];
	Game(Player ...p)
	{
		this.p=p;
	}
	Player  [] Parray()
	{
		return p;
	}
}
//---------------------------------------------------------------------------
public class Player_cun
{
	public static void main(String x[])
	{
		 Player p1 = new Player("Alice", 5, 250);
        Player p2 = new Player("Bob", 3, 300);
        Player p3 = new Player("Charlie", 4, 280);
        Player p4 = new Player("David", 6, 350);
		
		Game g=new Game(p,p1,p2,p3,p4);
		Player a[]=g.Parray();
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\t\t"+a[i]);
		}
	}
}
