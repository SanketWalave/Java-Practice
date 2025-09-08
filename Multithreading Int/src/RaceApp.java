class Cars implements Runnable{
    protected String carname;
    public Cars(String carname){
        this.carname=carname;
    }

    @Override
    public void run() {
        try {
            for(int i=1;i<=10;i++){
                System.out.println(carname);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
public class RaceApp {
    public static void main(String[] args)throws Exception {
        Cars c=new Cars("bolero");
        Thread th1=new Thread(c);
        Cars c2=new Cars("7oo");
        Thread th2=new Thread(c2);

        Cars c3=new Cars("mahindra xuv 3xo");
        Thread th3=new Thread(c3);

        System.out.println("start");
        th3.start();
        th1.start();
        th2.start();
        th3.join();
        th1.join();
        th2.join();

        System.out.println("game over");
    }
}
