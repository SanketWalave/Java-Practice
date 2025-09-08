class Rev
{
    private int num;
    public void setValue(int num){this.num=num;}
    public int getRev(){
        int rev=0;
        while (num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            if(rev>(Integer.MAX_VALUE-rem)/10)return 0;
            num/=10;
        }
        return rev;
    }
}
public class Reverse_24_4 {
    public static void main(String[] args) {
        Rev r=new Rev();
        r.setValue(1234567899);
        System.out.println(r.getRev());
    }
}

