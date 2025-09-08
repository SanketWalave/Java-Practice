/*Demonstrate auto-boxing and auto-unboxing using any
 primitive type and its corresponding wrapper class.

 */
public class AutoBoxUnBox_8_5 {
    public static void main(String[] args) {
        //autoboxing
        int a=123;
        Integer b=a;
        System.out.println(b);

//        Unboxing
        Integer c=345;
        int d=c;
        System.out.println(c);
    }
}
