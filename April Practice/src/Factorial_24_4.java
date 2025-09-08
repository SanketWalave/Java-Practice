class Facto
{
    private int a;
    public void setValue(int a){this.a=a;}
    public long getFact()
    {
        long f=1;
        for(int i=1;i<=a;i++)f*=i;

        return f;
    }
}
public class Factorial_24_4 {
    public static void main(String[] args) {
        Facto f=new Facto();
        f.setValue(5);
        System.out.println(f.getFact());
    }
}
