public class Armstrong {
    public static void main(String[] args) {
     int num=153;
     int temp=num,count=0,sum=0;
     for(;num!=0;num/=10)count++;
     num=temp;
     for(;num!=0;num/=10){
         int rem=num%10,p=1;
         for(int i=1;i<=count;i++)p*=rem;
         sum+=p;
     }
        System.out.println(sum==temp);
    }
}
