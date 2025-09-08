public class Sub_str_012_19_3_3 {
    public static void main(String[] args) {
        String str= "102100211";
        char ch[]=str.toCharArray();
        int count=0;
        for(int st=0;st<ch.length;st++)
        {
            for(int end=st;end<ch.length;end++)
            {
                int count0=0,count1=0,count2=0;
                for(int i=st;i<=end;i++)
                {
                    if(ch[i]=='0')
                        count0++;
                    if(ch[i]=='1')
                        count1++;
                    if(ch[i]=='2')
                        count2++;
                }


                if(count0==count1 && count1==count2 && count0!=0)
                {
                    count++;
                }
            }
        }
        System.out.println("output : "+count);
    }
}
