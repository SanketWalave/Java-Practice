class Player
{
	private String name;
	private int jersyno, run ,matches;
	public void setJersyNo(int jersyno)
	{
		this.jersyno = jersyno;
	}
	public int getJersyno()
	{
		return jersyno;
	}

	public void setName(String name)
	{
		this.name = name
	}
	public int getName()
	{
		return name
	}

	public void setRuns(int run)
	{
		this.run = run
	}
	public int getRuns()
	{
		return run;
	}
	public void setMatches(int matches)
	{
		this.matches = matches;
	}
	public int getMatches()
	{
		return matches;
	}
	
	void showDetails()
	{
		
	}

}
public class PlayerInfoApp
{
	public static void main(String arg[])
	{
		String name ;
		int jersyno;
		int  run;
		int matches;
		int a [] = new int[4];
		Player p = new Player();
		P.setJersyno(1);
		p.setNameString("Saurabh");
		p.setRuns(500);
		p.setMatches(20);
		
		Player p1 = new Player();
		P1.setJersyno(2);
		p1.setNameString("Aniket");
		p1.setRuns(400);
		p1.setMatches(30);
		
		Player p2 = new Player();
		P2.setJersyno(3);
		p2.setNameString("Abhi");
		p2.setRuns(450);
		p2.setMatches(25);
		
		Player p3 = new Player();
		P3.setJersyno(4);
		p3.setNameString("Pratham");
		p3.setRuns(600);
		p3.setMatches(35);
		
		p.showDetails();
	}
}