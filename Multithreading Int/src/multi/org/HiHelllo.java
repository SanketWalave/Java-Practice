package multi.org;




//class Hii extends Thread
class Hii implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("hii    "+i);
            try {
                Thread.sleep(10);
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }
}
//class Hellow extends Thread
class Hellow implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("hellow  "+i);
            try {
                Thread.sleep(10);
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }
}
public class HiHelllo {

    public static void main(String[] args) {
//        Hii h=new Hii();
//        Hellow hl=new Hellow();
//        h.start();
//        hl.start();

        Runnable h=new Hii();
        Runnable hl=new Hellow();
       Thread t1=new Thread(h);
       Thread t2=new Thread(hl);
        t1.start();
        t2.start();
    }
}

