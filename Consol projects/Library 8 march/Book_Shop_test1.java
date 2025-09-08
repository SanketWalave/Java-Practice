import java.util.*;
public class Book_Shop_test1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int admin=0;
		Book b[]=new Book[0];
		Stud_lib sl[]=new Stud_lib[0];
		Libraryiyn lib=new Libraryiyn();
		Student stud=new Student();
		User user[]=new User[2];
		user[0]=new User(1,"sanket","sanket.com",1234,"library");
		user[1]=new User(2,"santosh","santosh.com",9876,"student");
		
		boolean while1=true;
		boolean while3=false;
		
		int number=0;
		boolean while2=true;
		String usercheck="";
		do{
			int lAcount=3;
		while(while1)
		{
			System.out.println("Enter email");
			String email=sc.next();
			System.out.println("Enter password");
			 number=sc.nextInt();
			
			
			for(int i=0;i<user.length;i++)
			{
				//System.out.println(user[i].getEmail());
				//System.out.println(user[i].getContact());
				if(user[i].getContact()==number && user[i].getEmail().equals(email))
				{
					usercheck="librariyan";
					
				}
			}
			
			if(usercheck.equals("librariyan"))
			{
				
				while1=false;
			}
			else
			{
				System.out.println("you are not user try again with correct info");lAcount--;
				if(lAcount==0)
				{
					while1=false;
					System.exit(0);
				}
			    
			}
		 }
			
			
			if(usercheck.equals("librariyan"))
			{
				System.out.println("\nyou are librariyan you cn perform following operation\n");
				System.out.println("Enter your choice");
				System.out.println("1:add students");
				System.out.println("2:add book");
				System.out.println("3:view student ");
				System.out.println("4:serch student by name");
				System.out.println("5:view all book");
				System.out.println("6:search book by name");
				System.out.println("7:view issued book");
				System.out.println("8:view Student who issued book");
				System.out.println("9:view total number of books in library");
				System.out.println("10:avalable book count");
				System.out.println("11:issued book count");
				System.out.println("12:Login as student");
				System.out.println("13:leave from system");
				
				int switch1=sc.nextInt();
				switch(switch1)
				{
					case 1:
					      System.out.println("Enter student array size");
						 int studsize=sc.nextInt();
						  sl=new Stud_lib[studsize];
						 for(int i=0;i<sl.length;i++)
						 {
							 System.out.println("Enter student name");
							 String studentname=sc.next();
							 System.out.println("enter email");
							 String studemail=sc.next();
							 sl[i]=new Stud_lib();
							 sl[i].setStudName(studentname);
							 sl[i].setStudemail(studemail);
						 }
						 lib.addStudent(sl);
						 
					break;
					case 2:
					    System.out.println("Enter book array size");
						 int booksize=sc.nextInt();
						  b=new Book[booksize];
						 for(int i=0;i<b.length;i++)
						 {
							System.out.println("enter book id");
							int bid=sc.nextInt();
							System.out.println("enter book name");
							String bname=sc.next();
							System.out.println("enter auther");
							String bauther=sc.next();
							System.out.println("enter subject");
							String bsubject=sc.next();
							System.out.println("Enter 0 if book is baned");
							   int ban=sc.nextInt();
							   boolean bisban=true;
							   if(ban==0)
								   bisban=false;
							System.out.println("Enter 0 if book is issued");
							    ban=sc.nextInt();
							   boolean status=true;
							   if(ban==0)
								   status=false;
							   
							 b[i]=new Book();
							 b[i].setBid(bid);
							 b[i].setBname(bname);
							 b[i].setBauther(bauther);
							 b[i].setBsubject(bsubject);
							 b[i].setBisban(bisban);
							 b[i].setStatus(status);
								   
						 }
						 lib.addBooks(b);
						
					break;
					case 3:
					   lib.viewStudents();
							
					break;
					case 4:
							
							System.out.println("enter email or name");
							String case3=sc.next();
							lib.searchStud(case3);
					break;
					case 5:
					lib.viewBook();
					break;
					case 6:
							System.out.println("enter book name");
							 case3=sc.next();
							lib.searchBook(case3);
					break;
					
					case 7:
					     lib.viewIssuedBook();
					break;
					case 8:
					
					break;
					case 9:
					    System.out.println("avalable books in library  "+lib.viewBookCount());
					break;
					case 10:
						System.out.println("avalable book count  "+lib.viewAvalableBookCount());
					break;
					case 11:
						System.out.println("issued book count  "+lib.viewIssuedBookCount());
					break;
					case 12:
					
					boolean while12=true;
					boolean flag=false;
					int count=3;
					while(while12)
					{
						System.out.println("Enter email ");
						String email=sc.next();
						System.out.println("Enter name");
						String name=sc.next();
							for(int i=0;i<sl.length;i++)
							{
								if(sl[i].getStudName().equals(name) && sl[i].getStudemail().equals(email))
								{
									admin=i;
									flag=true;
									System.out.println("Login sucsessfull");
									while3=false;
									break;
								}
							}
						count--;
						if(count==0 || flag)
						{
							while12=false;
						}
						else
							System.out.println("Enter valid details");
					
		
	
					  
					}
					if(flag)
					    while3=true;
					  lib.setStudentLogin(flag);
					  break;
					  case 13:
					      System.exit(0);
					  break;
					default :
					    
					break;
				}
			}
			
			
		
		
		while(while3)
		{
			if( lib.getStudentLogin())
			{
				System.out.println("\n\"you\" are student you cn perform following operation\n");
				System.out.println("Enter your choice");
			//	System.out.println(":login in system");
				System.out.println("1:view book");
				System.out.println("2:issue book");
				System.out.println("3:show own profile edit profile");
				System.out.println("4:self issued book");
				System.out.println("5:total book in library");
				System.out.println("6:show book not issued");
				System.out.println("7:return book to library");
				System.out.println("8:agen login as librarian");
				System.out.println("9:Logout from system");
				
				
				int switch2=sc.nextInt();
				switch(switch2)
				{
					
					case 1:
						stud.setBook(b);
						stud.viewBook();
					break;
					case 2:
					   System.out.println("Enter book name");
					   String name=sc.next();
					   System.out.println("Enter book id");
					   int id=sc.nextInt();
					   stud.isisueBook(name,id);
					break;
					case 3:
					   System.out.println("name  \t"+sl[admin].getStudName());
					   System.out.println("name  \t"+sl[admin].getStudemail());
					   System.out.println("you want toedit it if yes then enter y");
					   char sc3=sc.next().charAt(0);
					   if(sc3=='y')
					   {
						   System.out.println("Enter new name and email");
						   String sc3name=sc.next();
						   String sc3email=sc.next();
						   sl[admin].setStudName(sc3name);
						   sl[admin].setStudemail(sc3email);
					   }
					break;
					case 4:
					
					break;
					case 5:
					  System.out.println("avalable books in library  "+lib.viewBookCount());
					break;
					
					case 6:
					System.out.println("avalable book count  "+lib.viewAvalableBookCount());
					break;
					case 7:
					   System.out.println("enter name and is of book to return book");
					   String bname=sc.next();
					   int bids7=sc.nextInt();
					   stud.returnBook(bname,bids7);
					break;
					case 8:
					boolean while12=true;
					boolean flag=false;
					int count=3;
					while(while12)
					{
						System.out.println("Enter email ");
						String email=sc.next();
						System.out.println("Enter number");
						int number8=sc.nextInt();
							for(int i=0;i<user.length;i++)
							{
								if(user[i].getContact()==number8 && user[i].getEmail().equals(email))
								{
									flag=true;
									System.out.println("Login sucsessfull");
									 while3=false;
									 usercheck="librariyan";
									break;
								}
							}
						count--;
						if(count==0 || flag)
						{
							while12=false;
						}
						else
							System.out.println("Enter valid details");
					
					}
					 
					break;
					case 9:
					 System.exit(0);
					break;
					default :
					
					break;
				}
			}
		}
		}while(while2);
		
	}
}