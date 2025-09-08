
class Demo{
    public Demo()
    {

        this(12);
        System.out.println("hellow");
    }
    public Demo(int a)
    {
        this("sanket","walave");
        System.out.println(a);

    }
    public Demo(String name,String surname)
    {
        System.out.println(name);
        System.out.println(surname);
    }
}
public class Cunst_test {
    public static void main(String[] args) {
        Demo d=new Demo();

    }
}
