class A extends Thread{
    public void run(){
      try {
          for (int i = 1; i < 5; i++) {
              System.out.println(i);
              Thread.sleep(100);
          }
      }catch (Exception e){
          System.out.println(e);
      }
    }
}
class B extends Thread{
    public void run(){
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println(i+5);
                Thread.sleep(1500);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

public class Thread_1_10_7 {
    public static void main(String[] args)throws Exception {
            A a=new A();
            a.start();
//        a.join();
        B b=new B();
        b.start();
    }
}
