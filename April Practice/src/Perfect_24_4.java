class Perfect
{
    private int num;
    public void setValue(int num){this.num=num;}
    public boolean isPerfect(){
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)sum+=i;
            if(sum>num)return false;
        }
        return sum==num;
    }
}
public class Perfect_24_4 {
    public static void main(String[] args) {
        Perfect p=new Perfect();
        p.setValue(6);
        System.out.println(p.isPerfect());
    }
}
