public class Count_Even_Odd_22_4 {
    public static void main(String[] args) {
        int a[]={1,2,2,2,2,2,2,2,2,2};
        int ec=0,eo=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)ec++;
            if(a[i]%2==1)eo++;
        }
        System.out.println("even  "+ec);
        System.out.println("odd   "+eo);
    }
}
