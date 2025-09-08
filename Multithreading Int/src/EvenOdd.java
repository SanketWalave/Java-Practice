/*WAP to create two threads name Even and Odd and Even thread print even values between
1 to 10 and Odd thread print odd values between 1 to 10 and use join() methods as well as
perform this code using synchronization technique also. */
class EvenOddThread implements Runnable{
    protected int n;
    public EvenOddThread(int n){
        this.n=n;
    }

    @Override
    public void run() {
        try {
            for(int i=n;i<=10;i+=2){
                System.out.println(i+"\t"+Thread.currentThread().getName()+"\t"+Thread.currentThread().getPriority());
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
public class EvenOdd {
    public static void main(String[] args) {
        Thread th1=new Thread(new EvenOddThread(1));
        Thread th2=new Thread(new EvenOddThread(0));
        Thread th3=new Thread(new EvenOddThread(-10));
//        th1.setPriority(Integer.MIN_VALUE);
//        th1.setPriority(12);

        Thread t=Thread.currentThread();
        System.out.println(t);
        try {
            System.out.println("asdfghjkl;\t"+th1.getName());
            System.out.println("asdfghjkl;\t"+th1.getPriority());
            th1.start();
            th1.join();
            th2.start();
            th2.join();
            th3.start();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
}
