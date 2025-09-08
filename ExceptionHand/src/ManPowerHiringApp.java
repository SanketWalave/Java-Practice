import java.util.Scanner;

class AgeVerificationExe extends RuntimeException
{  private String message;
    AgeVerificationExe(String message)
    {
        this.message=message;
    }
    public String getErrMessage(){
        return message;
    }
}
class Hiring
{
    void checkAge(int age)
    {
        if(age<=15)
        { throw new AgeVerificationExe("Your age is not suitable ");//+age);
        }
        else
        { System.out.println("On boarding process start");
        }
    }
}
public class ManPowerHiringApp
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        try{
            Hiring h  = new Hiring();
            h.checkAge(sc.nextInt());
        }
        catch(AgeVerificationExe e)
        { System.out.println("Error is "+e.getErrMessage());
        }
    }
}