class Book
{
	private int bid;
	private String bname;
	private String bauther;
	private String bsubject;
	private boolean bisban;
	private boolean status;
	/*Book(int bid,String bname,String bauther,String bsubject,boolean bisban,boolean status)
	{
		this.bid=bid;
		this.bname=bname;
		this.bauther=bauther;
		this.bsubject=bsubject;
		this.bisban=bisban;
		this.status=status;
	}*/
	public void setBid(int bid)
	{
		this.bid=bid;
	}
	public void setBname(String bname)
	{
		this.bname=bname;
	}
	public void setBauther(String bauther)
	{
		this.bauther=bauther;
	}
	public void setBsubject(String bsubject)
	{
		this.bsubject=bsubject;
	}
	public void setBisban(boolean bisban)
	{
		this.bisban=bisban;
	}
	public void setStatus(boolean status)
	{
		this.status=status;
	}
	public int getBid()
	{
		return bid;
	}
	public String getBname()
	{
		return bname;
	}
	public String getBauther()
	{
		return bauther;
	}
	public String getBsubject()
	{
		return bsubject;
	}
	public boolean getBisban()
	{
		return bisban;
	}
	public boolean getStatus()
	{
		return status;
	}
}
