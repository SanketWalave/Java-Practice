import java.util.ArrayList;

public class Permuntations_23_4 {
    public static void main(String[] args) {
        System.out.println(isPresent("ahb","abc"));

    }
    public static boolean isPresent(String str,String s)
    {
        ArrayList al = new ArrayList<>();
        char a[] = str.toCharArray();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    if (i != j && j != k && k != i) {

                        String prm=""+a[i]+a[j]+a[k];
                        al.add(prm);
                       // if(prm.equals(s)) return true;
                    }
                }
            }
        }
        System.out.println(al);
        return false;
    }
}
