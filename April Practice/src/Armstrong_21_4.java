public class Armstrong_21_4 {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
    public static boolean isArmstrong(int num)
    {
        int count=0,sum=0;
        int temp=num;
        for(;num>0;num/=10)
            count++;
        num=temp;
        for(;num>0;num/=10)
        {
            int rem=num%10;int power=1;
            for(int i=1;i<=count;i++)
                power*=rem;
            sum+=power;
        }
        return sum==temp;
    }
}
