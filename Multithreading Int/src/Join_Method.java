class First extends Thread{
    @Override
    public void run() {
        try {
            for(int i=1;i<=10;i++){
                System.out.println("first\t"+i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
class Second extends Thread{
    @Override
    public void run() {
        try {
            for(int i=11;i<=20;i++){
                System.out.println("second\t"+i);
                Thread.sleep(100);
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
public class Join_Method {
    public static void main(String[] args)throws Exception {
        First f=new First();
        f.start();
        f.join();
        Second s=new Second();
        s.start();
    }
}
