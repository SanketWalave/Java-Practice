class MaxRep {
    public int maxRepeating(String sequence, String word) {
        if(sequence.equals(word)) return 1;
        int count=0;
        int a[]=new int[sequence.length()+1];
//        System.out.println(a.length);
        int len=word.length();
//        System.out.println(len);
        for(int i=len;i<=sequence.length();i++){
              if(sequence.substring(i-len,i).equals(word)){
                  a[i]=a[i-len]+1;
                  if(a[i]>count)count=a[i];

             }
//             len++;
        }
//        System.out.println(len);
//        System.out.println(sequence.length());
        return count;

//        int n = sequence.length();
//        int m = word.length();
//        System.out.println(n);
//        System.out.println(m);
//        int[] dp = new int[n + 1];
//        int maxRepeat = 0;
//
//        for (int i = m; i <= n; i++) {
//            System.out.println(sequence.substring(i - m, i));
//            if (sequence.substring(i - m, i).equals(word)) {
//                dp[i] = dp[i - m] + 1;
//                System.out.println(" i="+i+" "+dp[i]+" (i-m)="+(i-m)+" "+dp[i-m]+" +1 "+(dp[i-m]+1));
//                System.out.print("\t\t"+i+sequence.substring(i - m, i)+"\n");
//                maxRepeat = Math.max(maxRepeat, dp[i]);
//            }
//        }
//
//        return maxRepeat;
    }
}
public class MaxRepSubStr_1668 {
    public static void main(String[] args) {
        MaxRep m=new MaxRep();
        int ans= m.maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba","aaaba");
        System.out.println(ans);
    }
}
