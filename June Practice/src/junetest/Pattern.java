package junetest;

import java.util.*;

public class Pattern {
    public static void main(String[] args) {
       List al=new LinkedList();
        System.out.println();
       for(int i=0;i<=10;i++)al.add(i*10);
       al.add(null);
       for(int i=0;i<al.size();i++){
           System.out.println(al.get(i));
       }

    }
}
//int st=1;
//        for(int i=1;i<=5;i++){
//            char ch='A';
//            int c=1;
//            for(int j=1;j<=9;j++){
//                if(j<=i*2-1){
//                   if(c<=st/2)
//                       System.out.print(ch++);
//                   else
//                       System.out.print(ch--);
//
//                   c++;
//                }
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//            st+=2;
//        }
//       al.forEach((val)-> System.out.println(val));
//        System.out.println(al);
//        al.add(10);
//       ListIterator li=al.listIterator(al.size());
//       while (li.hasPrevious()){
//           Object obj=li.previous();
//           System.out.println(obj);
//       }
//        ListIterator li=al.listIterator();
//        while (li.hasNext()){
//            Object obj=li.next();
//            System.out.println(obj);
//        }
//        System.out.println(al);