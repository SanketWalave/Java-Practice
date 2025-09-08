class Student
{
	private String sdpname;
	private String year;
	private Book b[];
	private Stud_lib sl[];
	public void setStudinfo(String sdpname,String year)
	{
		this.year=year;
		this.sdpname=sdpname;
		
	}
	public void setBook(Book ...b)
	{
		this.b=b;
	}
	public void setStud_lib(Stud_lib ...sl)
	{
		this.sl=sl;
	}
	public void viewBook()
	{
		//System.out.println("book id \t book name \t book auther\t book subject \t book ban \t status");
		if(b.length==0)
			System.out.println("no books");
		for(int i=0;i<b.length;i++)
		{
			System.out.println("========================================================================");
			if(b[i]==null)
			{
				System.out.println("No books avalable");
				break;
			}
			System.out.println("book id       \t"+b[i].getBid());
			System.out.println("book name     \t"+b[i].getBname());
			System.out.println("book auther   \t"+b[i].getBauther());
			System.out.println("book subject  \t"+b[i].getBsubject());
			System.out.println("book is ban   \t"+b[i].getBisban());
			System.out.println("book is issud \t"+b[i].getStatus());
			
		}
		System.out.println("========================================================================");
	}
	public void isisueBook(String bname,int bid)
	{
		boolean flag=false;
		for(int i=0;i<b.length;i++)
		{
			if(b[i].getBname().equals(bname) && bid==b[i].getBid())
			{
				if(b[i].getStatus())
				{
					System.out.println("book issued sucsess fully");
					b[i].setStatus(false);
					flag=true;
					break;
				}
				else
					System.out.println("Book is alredy issued");
			}
		}
		if(!flag)
			System.out.println("Book not found");
		
	}
	public void returnBook(String bname,int bid)
	{
		boolean flag=false;
		for(int i=0;i<b.length;i++)
		{
			if(b[i].getBname().equals(bname) && bid==b[i].getBid())
			{
				if(b[i].getStatus())
				{
					
				}
				else
				{
					System.out.println("book returnd sucsess fully");
					b[i].setStatus(true);
					flag=true;
					break;
				}
			}
		}
		if(!flag)
			System.out.println("Book not found");
		
	}
	
	
	
}
