public class Patterns {
    public static void main(String[] args) {
//        Pattern();
        String str="sanket walave \n hhdhfhhf \n hvhb";
        System.out.println(str);
    }
    public static void Pattern()
    {
        int st=1;
        for(int i=1;i<=5;i++){
            int c=0;
            int count=i-1;
            for(int j=1;j<=9;j++){
                if(j<=i+4 && j>=6-i) {
                    if(st/2>=c){
                        count++;
                        System.out.print(count);

                    }
                    else {
                        count--;
                        System.out.print(count);
                    }
                    c++;
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println("\t\t\t"+st/2);
            st+=2;
        }
    }
}
