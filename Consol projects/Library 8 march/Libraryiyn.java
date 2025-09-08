class Libraryiyn
{
	private boolean flag=false;
	private Book b[];
	private Stud_lib sl[];
	public void addBooks(Book ...b)
	{
		this.b=b;
	}
	public void addStudent(Stud_lib ...sl)
	{
		this.sl=sl;
	}
	
	public void viewBook()
	{
		//System.out.println("book id \t book name \t book auther\t book subject \t book ban \t status");
		for(int i=0;i<b.length;i++)
		{
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
			System.out.println("========================================================================");
		}
	}
	public void viewStudents()
	{
		for(int i=0;i<sl.length;i++)
		{
			if(sl[i]==null)
			{
				System.out.println("No books avalable");
				break;
			}
			System.out.println("student name     \t"+sl[i].getStudName());
			System.out.println("student email    \t"+sl[i].getStudemail());
			
			System.out.println("========================================================================");
		}
	}
	public void searchStud(String name)
	{
		boolean flag=true;
		System.out.println("========================================================================");
		for(int i=0;i<sl.length;i++)
		{
			if(sl[i].getStudName().equals(name) || sl[i].getStudemail().equals(name))
			{
				System.out.println("Student found");
				flag=false;
				break;
			}
			
			
		}
		if(flag)
			System.out.println("Student not found");
	}
	public void searchBook(String name)
	{
		boolean flag=true;
		System.out.println("========================================================================");
		for(int i=0;i<b.length;i++)
		{
			if(b[i].getBname().equals(name))// || sl[i].getStudemail().equals(name))
			{
				System.out.println("Book found");
				flag=false;
				break;
			}
			
			
		}
		if(flag)
			System.out.println("Book not found");
	}
	public void viewIssuedBook()
	{
		//System.out.println("book id \t book name \t book auther\t book subject \t book ban \t status");
		for(int i=0;i<b.length;i++)
		{
			if(b[i].getStatus())
			{
				continue;
			}
			else{
			System.out.println("book id       \t"+b[i].getBid());
			System.out.println("book name     \t"+b[i].getBname());
			System.out.println("book auther   \t"+b[i].getBauther());
			System.out.println("book subject  \t"+b[i].getBsubject());
			System.out.println("book is ban   \t"+b[i].getBisban());
			System.out.println("book is issud \t"+b[i].getStatus());
			System.out.println("========================================================================");
			}
		}
	}
	public int viewBookCount()
	{
		int count=0;
		//System.out.println("book id \t book name \t book auther\t book subject \t book ban \t status");
		for(int i=0;i<b.length;i++)
		{
			
				count++;
			
			
		}
		return count;
	}
	public int viewAvalableBookCount()
	{
		int count=0;
		//System.out.println("book id \t book name \t book auther\t book subject \t book ban \t status");
		for(int i=0;i<b.length;i++)
		{
			if(!b[i].getStatus())
			{
				count++;
			}
			
		}
		return count;
	}
	public int viewIssuedBookCount()
	{
		int count=0;
		//System.out.println("book id \t book name \t book auther\t book subject \t book ban \t status");
		for(int i=0;i<b.length;i++)
		{
			if(b[i].getStatus())
			{
				count++;
			}
			
		}
		return count;
	}
 

	public void setStudentLogin(boolean flag)
	{
		this.flag=flag;
	}
	public boolean getStudentLogin()
	{
		return flag;
	}
	
}

