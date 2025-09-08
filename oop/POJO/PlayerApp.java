class Player
{
   private int id;
   private String name;
   private int run;
   
   public void setId(int i)
   { id=i;
   }
   public int getId()
   { return id;
   }
   public void setName(String n)
   { name=n;
   }
   public String getName()
   { return name;
   }
   public void setRun(int r)
   { run=r;
   }
   public int getRun()
   { return run;
   }
   
  }
public class PlayerApp
{
    public static void main(String x[])
	{
	    Player p1= new Player();
		p1.setId(1);
		p1.setName("RAM");
		p1.setRun(1000);
		
		System.out.println(p1.getId()+"\t"+p1.getName()+"\t"+p1.getRun());
	}
}
