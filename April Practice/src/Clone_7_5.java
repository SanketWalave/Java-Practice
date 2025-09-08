import java.util.*;
class Square_7_5 implements Cloneable
{
    private int num;
    public void setValue(int num){this.num=num;}
    public void getRes(){
        System.out.println(num*num);
    }

//    @Override
//    protected Square_7_5 cloneSq() throws CloneNotSupportedException {
//        Object obj=this.clone();
//        return (Square_7_5) obj;
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Clone_7_5 {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        Square_7_5 s1=new Square_7_5();
        s1.setValue(10);
//        Square_7_5 s2=(Square_7_5) s1.clone();
       Square_7_5 s2=s1;
       Square_7_5 s3=s2;
       s2.setValue(5);
        s1.getRes();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

    }
}
