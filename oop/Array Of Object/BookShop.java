/*
Q1.	Create class name as Book with using data member bid,bname,bprice,fauthor,bpublication using do while and 
		switch case and using set and get.
		
		create array of object of size 10 ,store the Book details in it and perform following operations.
	
	case 1 : Add All Book details.
	case 2 : Display All Book details.
	case 3 : Display Book details whose price range between 100 to 500.
	case 4 : Search Book  details using by:
					case 1 : Book Id
					case 2 : Book name
					case 3 : Book price
					case 4 : Book author.
	case 5 : Update Book details using by:
					case 1 :  Book Id
					case 2 : Book name
					case 3 : Book price
					case 4 : Book publication.	
	case 6 : Delete Book details using by:
					case 1 : Book Id
					case 2 : Book name
					case 3 : Book price
					case 4 : Book publication.
					case 5 : Book author.
	case 7 : Count Book details using by:
					case 1 : Book name
					case 2 : Book price
					case 3 : Book publication.
					case 4 : Book author.
	case 8 : Sort Book Details :
					case 1 : Ascending Order By Id.
					case 2 : Descending Order By Price.
	case 9 : Display Second Highest Book Price Details.
	case 10 : Exit the code.
*/
import java.util.*;
/*	Create class name as Book with using data member bid,bname,bprice,fauthor,bpublication using do while and 
		switch case and using set and get.
		
		create array of object of size 10 ,store the Book details in it and perform following operations.
*/
class Book
{
	private int bid;
	private String bname;
	private int bprice;
	private String bauther;
	private String bpublication;
	void setBid(int bid)
	{
		this.bid=bid;
	}
	int getBid()
	{
		return bid;
	}
	void setBname(String bname)
	{
		this.bname=bname;
	}
	String getBname()
	{
		return bname;
	}
	void setBprice(int bprice)
	{
		this.bprice=bprice;
	}
	int  getBprice()
	{
		return bprice;
	}
	void setBauther(String bauther)
	{
		this.bauther=bauther;
	}
	String getBauther()
	{
		return bauther;
	}
	void setBpublication(String bpublication)
	{
		this.bpublication=bpublication;
	}
	String getBpublication()
	{
		return bpublication;
	}
	
}

//case 1 : Add All Book details.
class Display_B_Details
{
	Book b[];
	void setBook(Book b[])
	{
		this.b=b;
	}
	void Show()
	{
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==null)
			{
				System.out.println("No book present ");
				
			}
			else
			{
			System.out.println("\t"+i+"\t book details");
			System.out.println("Book id          "+b[i].getBid());
			System.out.println("Book name        "+b[i].getBname());
			System.out.println("Book price       "+b[i].getBprice());
			System.out.println("Book author      "+b[i].getBauther());
			System.out.println("Book publication "+b[i].getBpublication());
			}
		}
	}
}
//case 3 : Display Book details whose price range between 100 to 500.
class Book_Range_100to500
{
	Book b[];
	void setBook(Book b[])
	{
		this.b=b;
	}
	void Show_inRange()
	{
		for(int i=0;i<b.length;i++)
		{
			 if(b[i]==null)
			{
				continue;
			}
			else if(b[i].getBprice()>=100 && b[i].getBprice()<=500)
			{
				System.out.println("\t"+i+"\t book details");
				System.out.println("Book id          "+b[i].getBid());
				System.out.println("Book name        "+b[i].getBname());
				System.out.println("Book price       "+b[i].getBprice());
				System.out.println("Book author      "+b[i].getBauther());
				System.out.println("Book publication "+b[i].getBpublication());
			}
			
		}
	}
}

/*case 4 : Search Book  details using by:
					case 1 : Book Id
					case 2 : Book name
					case 3 : Book price
					case 4 : Book author.
					*/
class SearchBook
{
	private Book b[];
	void SetBook(Book b[])
	{
		this.b=b;
	}
	void SearchBookById( int id)
	{
		boolean flag=true;
		for(int i=0;i<b.length;i++)
		{
			 if(b[i]==null)
			{
				/*System.out.println("-------------------------------------------");
				System.out.println("book not found");
				System.out.println("\n-----------------------------------------");*/
				continue ;
			}
			else if(b[i].getBid()==id)
			{
				System.out.println("Book id          "+b[i].getBid());
				System.out.println("Book name        "+b[i].getBname());
				System.out.println("Book price       "+b[i].getBprice());
				System.out.println("Book author      "+b[i].getBauther());
				System.out.println("Book publication "+b[i].getBpublication());
				flag=false;
				break ;
			}
			
			
				
		}
		if (flag)
			System.out.println("book not found");
	}
	void SearchBookByName(String name)
	{
		boolean flag=true;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==null)
			{
				continue ;
			}
			else if(b[i].getBname().equals(name))
			{
			
				System.out.println("Book id          "+b[i].getBid());
				System.out.println("Book name        "+b[i].getBname());
				System.out.println("Book price       "+b[i].getBprice());
				System.out.println("Book author      "+b[i].getBauther());
				System.out.println("Book publication "+b[i].getBpublication());
				flag=false;
			}
			
		}
		if(flag)
				System.out.println("book not found");
	}
	void SearchBookByPrice(int price)
	{
		boolean flag=true;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==null)
			{
				continue ;
			}
			else if(b[i].getBprice()==price)
			{
				System.out.println("Book id          "+b[i].getBid());
				System.out.println("Book name        "+b[i].getBname());
				System.out.println("Book price       "+b[i].getBprice());
				System.out.println("Book author      "+b[i].getBauther());
				System.out.println("Book publication "+b[i].getBpublication());
				flag=false;
			}
			else
				System.out.println("book not found");
		}
		if(flag)
			System.out.println("book not found");
	}
	void SearchBookByAuther(String auther)
	{
		boolean flag=true;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==null)
			{
				continue ;
			}
			else if(b[i].getBauther().equals(auther))
			{
				System.out.println("Book id          "+b[i].getBid());
				System.out.println("Book name        "+b[i].getBname());
				System.out.println("Book price       "+b[i].getBprice());
				System.out.println("Book author      "+b[i].getBauther());
				System.out.println("Book publication "+b[i].getBpublication());
			}
			
		}
		if(flag)
			System.out.println("book not found");
	}
}
/*case 5 : Update Book details using by:
					case 1 :  Book Id
					case 2 : Book name
					case 3 : Book price
					case 4 : Book publication.	
	*/
/*class UpdateBook
{
	Book b[];
	void setBook(Book b[])
	{
		this.b=b;
	}
	void UpdateBookId(int id,String name,int price,String publication)
	{
		for(int i=0;i<b.length;i++)
		{
			if(id==b[i].getBid())
			{
				b[i].getBid()=id;
				b[i].getBname()=name;
				b[i].getBprice()=price;
				b[i].getBpublication()=publication;
			}
		}
	}
}
*/
/*case 6 : Delete Book details using by:
					case 1 : Book Id
					case 2 : Book name
					case 3 : Book price
					case 4 : Book publication.
					case 5 : Book author.
					*/
					
class DeletBook
{
	Book b[];
		
	void setBook(Book b[])
	{
		this.b=b;
	}
	void DeletById(int id)
	{
		boolean flag=true;
		for(int i=0;i<b.length;i++)
		{
			if(b[i].getBid()==id)
			{
				b[i]=null;
				flag=false;
				break ;
			}
		}
		if(flag)
			System.out.println("Book details not found");
	}
	void DeletByName(String name)
	{
		boolean flag=true;
		for(int i=0;i<b.length;i++)
		{
			if(b[i].getBname().equals(name))
			{
				b[i]=null;
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("Book details not found");
	}
	void DeletByPrice(int price)
	{
		boolean flag=true;
		for(int i=0;i<b.length;i++)
		{
			if(b[i].getBprice()==price)
			{
				b[i]=null;
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("Book details not found");
	}
	void DeletByAuther(String auther)
	{
		boolean flag=true;
		for(int i=0;i<b.length;i++)
		{
			if(b[i].getBauther().equals(auther))
			{
				b[i]=null;
				flag=false;
				break ;
			}
		}
		if(flag)
			System.out.println("Book details not found");
	}
	void DeletByPublication(String publication)
	{
		boolean flag=true;
		for(int i=0;i<b.length;i++)
		{
			if(b[i].getBpublication().equals(publication))
			{
				b[i]=null;
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("Book details not found");
	}
}
public class BookShop
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Capacity of books in Shop");
		int size=sc.nextInt();
		Book b[]=new Book[size];
		char ch;
		
	do
	{
		
		System.out.println("case 1 : Add All Book details");
		System.out.println("case 2-display book details");
		System.out.println("case 3-Display Book details whose price range between 100 to 500.");
		System.out.println("case 4 : Search Book  details using by:.");
		System.out.println("case 5 : Update Book details using by:");
		System.out.println("case 6 : Delete Book details using by:");
		
		System.out.println("Enter choice");
		int choice=sc.nextInt();
		switch (choice)
		{
		case 1:
		
		
		for(int i=0;i<b.length;i++)
		{
			b[i]=new Book();
			System.out.println("Enter book id");
			int bid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter book name");
			String bname=sc.nextLine();
			
			System.out.println("Enter book price");
			int bprice=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter book auther");
			String bauther=sc.nextLine();
			
			System.out.println("Enter book publication");
			String bpublication=sc.nextLine();
			//sc.nextLine();
			
			b[i].setBid(bid);
			b[i].setBname(bname);
			b[i].setBprice(bprice);
			b[i].setBauther(bauther);
			b[i].setBpublication(bpublication);
		}
		break ;
			case 2:
			Display_B_Details d=new Display_B_Details();
			d.setBook(b);
			d.Show();
			break ;

		case 3:
			Book_Range_100to500 d1=new Book_Range_100to500();
			d1.setBook(b);
			d1.Show_inRange();
			break;
			
		case 4:
		/*case 4 : Search Book  details using by:
					case 1 : Book Id
					case 2 : Book name
					case 3 : Book price
					case 4 : Book author.
					*/
			System.out.println("Enter by which method you want to search book");
			System.out.println("case 1 : Book Id");
			System.out.println("case 2 : Book name");
			System.out.println("case 3 : Book price");
			System.out.println("case 4 : Book author.");
		   int choice2=sc.nextInt();
		   SearchBook s=new SearchBook();
		   s.SetBook(b);
		   switch (choice2)
		   {
			   case 1:
			   System.out.println("Enter book id to search book");
				int bid=sc.nextInt();
			   s.SearchBookById(bid);
			   break ;
			   case 2:
			   System.out.println("Enter book name to search book");
			  String bname=sc.next();
			   s.SearchBookByName(bname);
			   break ;
			   case 3:
			   System.out.println("Enter book price to search book");
			  int  bprice=sc.nextInt();
			   s.SearchBookByPrice(bprice);
			   break ;
			   case 4:
			   System.out.println("Enter book auther name to search book");
			  String bauther=sc.nextLine();
			   s.SearchBookByAuther(bauther);
			   break ;
			   
			   
		   }
		   break ;
		   /*case 5 : Update Book details using by:
					case 1 :  Book Id
					case 2 : Book name
					case 3 : Book price
					case 4 : Book publication.	*/
		   case 5:
		   
		   
		   
		   break;
		   
		   
		   /*case 6 : Delete Book details using by:
					case 1 : Book Id
					case 2 : Book name
					case 3 : Book price
					case 4 : Book publication.
					case 5 : Book author.*/

         case 6:
		    System.out.println("Enter by which method you want to delete book");
			System.out.println("case 1 : Book Id");
			System.out.println("case 2 : Book name");
			System.out.println("case 3 : Book price");
			System.out.println("case 4 : Book author.");
			System.out.println("case 5 : Book author");
		   int choice3=sc.nextInt();
		   DeletBook d6= new DeletBook();
		   d6.setBook(b);
		   switch(choice3)
		   {
			   case 1:
			   System.out.println("enter book id to delet book");
			  int bid=sc.nextInt();
			   d6.DeletById(bid);
			   break;
			   case 2:
			   System.out.println("Enter book name to delet book");
			 String  bname=sc.next();
			   d6.DeletByName(bname);
			   break;
			   case 3:
			   System.out.println("Enter book price to delete book");
			int   bprice=sc.nextInt();
			   d6.DeletByPrice(bprice);
			   break ;
			   case 4:
			   System.out.println("Enter auther name to delet book");
			String   bauther=sc.next();
			   d6.DeletByAuther(bauther);
			   break;
			   case 5:
			   System.out.println("Enter Book publication to delet book");
			String   bpublication=sc.next();
			   d6.DeletByPublication(bpublication);
			   break ;
		   }
		    
			break;
		}
		System.out.println("enter (y or Y) to continue");
	 ch=sc.next().charAt(0);
	}while(ch=='y' || ch=='Y');
	}
}
	