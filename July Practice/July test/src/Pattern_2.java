public class Pattern_2 {
    public static void main(String[] args) {
        int c=1,c2=0;
        for(int i=1;i<=5;i++){
            if(i%2==0){
                c2=c+4;
            }
            for(int j=1;j<=5;j++){
                if(i%2==1){
                    System.out.print(c);
                }else {
                    System.out.print(c2--);
                }
                c++;
            }
            System.out.println();
        }
    }
}
