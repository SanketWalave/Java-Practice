class ArrayParent {
    protected int a[];

    public void setValue(int a[]) {
        this.a = a;
    }

    public int[] arrangeSq() {
        return a;
    }
}

class RevApp extends ArrayParent {
    public int[] arrangeSq() {
        int mid = a.length / 2;
        int end = a.length - 1;
        for (int i = 0; i < mid; i++) {
            int temp = a[i];
            a[i] = a[end];
            a[end] = temp;
            end--;
        }
        return a;
    }
}

class Descend extends ArrayParent {
    public int[] arrangeSq() {
        for (int j = 0; j < a.length; j++) {
            for (int i = j + 1; i < a.length; i++) {
                if (a[j] > a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
//               
                }
            }

        }
        return a;
    }
}

public class ArrayOper_24_4 {
    public static void main(String[] args) {
        int b[] = {1, 42, 8, 4, 9, 3};
        ArrayParent a = new ArrayParent();
        RevApp r = new RevApp();
        Descend d = new Descend();

        a.setValue(b);
        int ans[];

        ans = a.arrangeSq();
        for (int n : ans) System.out.print(n + "\t");
        System.out.println();
        r.setValue(b);
        ans = r.arrangeSq();
        for (int n : ans) System.out.print(n + "\t");
        System.out.println();
        d.setValue(b);
        ans = d.arrangeSq();
        for (int n : ans) System.out.print(n + "\t");

    }
}
