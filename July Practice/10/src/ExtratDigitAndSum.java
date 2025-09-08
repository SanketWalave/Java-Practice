public class ExtratDigitAndSum {
    public static void main(String[] args) {
        System.out.println(getSum("abc123mno456"));
    }
    public static int getSum(String str){
        int sum=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='0'&&ch<='9'){
                System.out.println(ch);
                sum+=(int)((ch-48));
                System.out.println(sum);
            }
        }
        return sum;
    }
}
