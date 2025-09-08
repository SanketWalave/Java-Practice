public class NumaricalyBalance_2048 {
    public static void main(String[] args) {
        int ans=nextBeautifulNumber(1);
        System.out.println(ans);
    }

    public static int nextBeautifulNumber(int n) {
        int i = n;
        while (true) {
           i++;
            boolean flag=true;
            int a[]=new int[10];
            int temp=i;
            while (temp>0){
                int rem=temp%10;
                a[rem]=a[rem]+1;
                if(a[rem]>rem){
//                    flag=false;
                    break;
                }
                temp/=10;
            }
            for(int k=0;k<a.length;k++)
            {
                if(a[k]!=k && a[k]!=0){
                    flag=false;
                    break;
                }
            }
            if(flag)return i;

        }
    }

}

