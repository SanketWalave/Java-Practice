class Count{
    private int count;
//    public Count(int count){
//        this.count=count;
//    }
    public synchronized void  increment(){
        count++;
    }
    public int getCount(){
        return count;
    }
}
class Thread1 extends Thread{
    private Count c;
    public Thread1(Count c){
        this.c=c;
    }

    @Override
    public void run() {
        try {
            for(int i=1;i<1001;i++){
                c.increment();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
public class Counter {
    public static void main(String[] args)throws Exception {
        Count c=new Count();
        Thread th1=new Thread(new Thread1(c));
        Thread th2=new Thread(new Thread1(c));

        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println(c.getCount());
    }
}
