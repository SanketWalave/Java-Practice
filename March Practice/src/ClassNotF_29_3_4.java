import java.util.*;

class C {
    public C() {
        System.out.println("hellow");
    }
}

public class ClassNotF_29_3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            C c = new C ();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("logic");
    }
}
