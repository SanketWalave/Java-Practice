import java.util.Scanner;

class CheckZero extends RuntimeException {
    String s;

    public CheckZero(String s) {
        this.s = s;
    }

    String getEx() {
        return s;
    }
}

class Factorial {
    public void setNum(int num) {
        if (num == 0) {
            throw new CheckZero("Numbew is " + num);
        } else {
            long fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println("factorial \t" + fact);
        }
    }
}

public class NumChec_Fact_15_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Factorial f = new Factorial();
            f.setNum(sc.nextInt());
        } catch (CheckZero c) {
            System.out.println(c.getEx());
        }
    }
}
