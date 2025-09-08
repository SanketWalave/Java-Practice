public class Perfect {
    public static void main(String[] args) {
        System.out.println(isPerfect(6));
    }
    public static boolean isPerfect(int num){
//        int sum=0;
//       for(int i=1;i<num;i++){
//           if(num%i==0)sum+=i;
//       }
//       return sum==num;
        int sum=0,temp=num;
        for(;num>0;num/=10){
            int rem=num%10;
            int power=1;
//            System.out.println(rem);
            for(int i=1;i<=rem;i++){
                power*=i;
//                System.out.println("\t\t"+power);
            }
            System.out.println(power);
            sum+=power;
        }
        return sum==temp;
    }
}

