import java.util.ArrayList;

public class PlayerArrayListHigest {
    public static void main(String[] args) {
        ArrayList<EMployee> al=new ArrayList<>();
        EMployee e1=new EMployee(1,"sanket",999999);
        EMployee e2=new EMployee(2,"anuj",756006);
        EMployee e3=new EMployee(3,"om",2445);
        EMployee e4=new EMployee(4,"sak",76543);
        EMployee e5=new EMployee(5,"fghj",6554);
        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);
        al.add(e5);

        EMployee h3=null;
        EMployee h2=null;
        long s3=Integer.MIN_VALUE;
        long s2=Integer.MIN_VALUE;
        long s1=Integer.MIN_VALUE;
        int i=0;
        for(EMployee e:al){
            if(e.getSalary()>s1){
                s2=s1;
                s1=e.getSalary();

            }else if(e.getSalary()<s1 && e.getSalary()>s2){
                s2=e.getSalary();
                h2=e;
            }else if(e.getSalary()<s2 && e.getSalary()>s3) {
                s3=e.getSalary();
                h3=e;
            }
            i++;
        }
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(h2.toString());
        System.out.println(h3.toString());
    }
}
