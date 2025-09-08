public class Pattern_21_7 {
    public static void main(String[] args) {
        int n=6;
        int tempn=n;
        int c=1;
        for(int i=1;i<=n;i++){
            if(i==1){
                c=1;
            }else {
                c+=tempn+1;
            }
            int innerc=c;
            int innertemp=tempn;
            for(int j=1;j<=n;j++){
                if(j<=i){
                    if(i==1) System.out.print(1);
                    else if(i>1){
                       if(j==1) System.out.print(innerc+"|");
                       else {
                           System.out.print((innerc - innertemp)+"|");
                           innerc -= innertemp;
                           innertemp++;
                       }
                    }
                }else{
                    System.out.print(" ");
                }
            }
            tempn--;
            System.out.println();
        }
    }
}
