public class EvenBet_21_4 {
    public static void main(String[] args) {
       getEven(10);
       getEven(-10);
    }
    public static void getEven(int limit)
    {
        for(int i=0;i<=limit;i++)
           if(i%2==0)
               System.out.print(i+"\t");
    }
}
