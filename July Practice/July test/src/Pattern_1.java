    public class Pattern_1 {
        public static void main(String[] args) {
            int c=1;
            for(int i=1;i<=5;i++){
                char ch='A';
                for(int j=1;j<=9;j++){
                    if(j<=i*2-1){
                        if(j<=c/2)
                            System.out.print(ch++);
                        else
                            System.out.print(ch--);
                    }
                }
                c=c+2;
                System.out.println();
            }
        }
    }
