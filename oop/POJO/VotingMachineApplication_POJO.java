/*Q1. WAP to Create Application Voting using following classes 

First class Voter with field : id , name and age and Mark Voter as POJO class
Second class is VotingMaching with following methods 
Void verifyVoter(Voter …v): this method can accept the voter details
Void showValidVote(): this method can show the voter whose age is greater than 18
Void showInvalidVote(): this method can show the voter list whose age is less than 18.
Note: write main method class name as VotingMachineApplication
*/
import java.util.*;
class Voter
{
	private String vid;
	private String vName;
	private int vAge;
	void setVId(String id)
	{
		vid=id;
	}
	String getVId()
	{
		return vid;
	}
	void setVName(String vname)
	{
		vName=vname;
	}
	String getVName()
	{
		return vName;
	}
	void setAge(int vage)
	{
		vAge=vage;
	}
	int getAge()
	{
		return vAge;
	}
}
class VotingMachin
{
	Voter voter[];
	void verifyVoter(Voter ...v)
	{
		voter=v;
	}
	
	void showValidVote()
	{ 
	    for(int i=0;i<voter.length;i++)
		{
		    if(voter[i].getAge()>=18)
			{
				System.out.println("\t\t showValidVote()");
				System.out.println(voter[i].getVId());
				
				System.out.println(voter[i].getVName());
				System.out.println(voter[i].getAge());
			}
		
		}
		
		
	}
	void showInvalidVote()
	{
		for(int i=0;i<voter.length;i++)
		{
		    if(voter[i].getAge()<18)
			{
				System.out.println("\t\t showInvalidVote()");
				System.out.println(voter[i].getVId());
				
				System.out.println(voter[i].getVName());
				System.out.println(voter[i].getAge());
			}
		
		}
	}
	
	
}
public class VotingMachineApplication_POJO
{
	public static void main (String x[])
	{
		VotingMachin vt=new VotingMachin();
		Voter vtr1=new Voter();
		vtr1.setVId("bvu563");
		vtr1.setVName("Santosh");
		vtr1.setAge(23);
		
		Voter vtr2=new Voter();
		vtr2.setVId("bv63");
		vtr2.setVName("Sah");
		vtr2.setAge(13);
		
		Voter vtr3=new Voter();
		vtr3.setVId("b3");
		vtr3.setVName("Sah");
		vtr3.setAge(33);
		
		vt.verifyVoter(vtr1,vtr2,vtr3);
		vt.showValidVote();
		vt.showInvalidVote();
	}
}