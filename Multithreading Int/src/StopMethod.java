class First_s extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("first\t" + i);
                if (i == 3) {
                    stop();
                }
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Second_s extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 11; i <= 20; i++) {
                System.out.println("second\t" + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

public class StopMethod {
    public static void main(String[] args) throws Exception{
        First_s f=new First_s();
        f.start();
        f.join();
        Second_s s=new Second_s();
        s.start();

    }
}
