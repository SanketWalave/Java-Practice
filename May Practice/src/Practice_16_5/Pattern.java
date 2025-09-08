package Practice_16_5;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int row=5;//sc.nextInt();
        int st=1;
        for(int i=1;i<row+1;i++){
            int c=1;
            int count=1;
            for(int j=1;j<=row;j++){
                if((j<=i+2 && j>=4-i && i<4 )|| ( j>=i-2 && j<9-i && i>3)) {
                    if(c<=st/2){
                        System.out.print(count++);
                    }else  {
                        System.out.print(count--);
                    }

                    c++;

                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("\t\t"+st);
           if(row/2<i)st+=2;
           else st-=2;
        }
        System.out.println(1/2);

    }
}
/*
*     *
*    ***
*   *****
*    ***
*     *
* */
//int count=0;
//int count2=0;
//        for(int i=1;i<=5;i++) {
//        if (i == 2)
//count2 = 10;         // if i is 2 then count2 is 10
//        if (i == 4)
//count2 = 20;         // if i is 4 then count2 is 20
//        for (int j = 1; j <= 5; j++) {
//
//        if (i % 2 == 1) {
//        ++count;              //incrising count
//                    System.out.print(count + " ");
//                    Thread.sleep(1000);
//                } else {
//                        System.out.print(count2-- + " ");  //dicrising count2 when i is even
//count++;               ////incrising count
//        Thread.sleep(1000);
//                }
//                        }
//                        System.out.println();//for adding next line
//}