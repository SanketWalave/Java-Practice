import java.util.Scanner;

//import static jdk.jfr.internal.consumer.EventLog.stop;

class Name implements Runnable {
    @Override
    public void run() {

        for (int i = 1; i <=5; i++) {
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println(e);
            }
            if (i == 5){
                System.out.println("time up");
                System.exit(0);
            }
        }
    }
}

public class NameTimer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Name n = new Name();
        Thread th = new Thread(n);
        th.start();
        System.out.println("Enter name under 5 sec");
        System.out.println("enter name :");
        String name = sc.nextLine();
        System.out.println("hellow " + name);

        sc.close();
    }
}
