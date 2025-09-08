class User
{
	private int uid;
	private String uname;
	private String email;
	private int contact;
	private String utype;
	User(int uid,String uname,String email,int contact,String utype)
	{
		this.uid=uid;
		this.uname=uname;
		this.email=email;
		this.contact=contact;
		this.utype=utype;
	}
	public int getUid()
	{
		return uid;
	}
	public String getUname()
	{
		return uname;
	}
	public String getEmail()
	{
		return email;
	}
	public int getContact()
	{
		return contact;
	}
	public String getUtype()
	{
		return utype;
	}
}