import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;

public class AllException {
//    static int a[];//for nullpointer

    public static void main(String[] args) {
        //   Arithmatic
//        int a=1;
//        int b=0;
//        try {
//            System.out.println(a/b);
//        }catch (ArithmeticException e){
//            System.out.println(e);
//        }


//        ArrayIndexOutOfBoundsException
//        int a[]={1,2,3,4};
//        try {
//            System.out.println(a[4]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }


//        NullPointerException
//        try {
//            a[0]=100;
//            System.out.println(a[0]);
//        }catch (NullPointerException e){
//            System.out.println(e);
//        }
//        if we try to access non static method by static reference
//                of class then also NullPointerException accurse


//        NumberFormatException
//        String str="123e";
//        try{
//            int a=Integer.parseInt(str);
//            System.out.println(a);
//        }catch (NumberFormatException n){
//            System.out.println(n);
//        }

//        ClassCastException
//        Object str=new String("hellow");
//        try {
//            Integer a=(Integer) str;
//            System.out.println(a);
//        }catch (ClassCastException e){
//            System.out.println(e);
//        }


//        FileNotFoundException
//        try{
//            File f=new File("D:\\SQL\\new .txt");
//            FileReader fr=new FileReader(f);
//            char ch[]=new char[(int)f.length()];
//            fr.read(ch);
//            String str=new String(ch);
//            System.out.println(str);
//        }catch (FileNotFoundException e){
//            System.out.println(e);
//        }catch (IOException ie){
//            System.out.println(ie);
//        }


//        IllegalArgumentException
//        try {
//            int size=-1;
//            if(size<0){
//                throw new IllegalArgumentException("Not recomendaed");
//            }
//        }catch (IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }

//        it accurse when we have to set a exceptipon on a specific
//                event licke checking age,nin zero


//        IndexOutOfBoundsException
//        try{
//            ArrayList a=new ArrayList();
//            a.add(10);
//            System.out.println(a.get(4));
//        }catch (IndexOutOfBoundsException e){
//            System.out.println(e);
//        }


//        NoSuchElementException
//        try{
//            ArrayList al=new ArrayList<>();
//            Iterator i=al.iterator();
//            System.out.println(i.next());
//        }catch (NoSuchElementException e){
//            System.out.println(e);
//        }
//        if we try ti fetch non existing element from
//                collection then this exception occurse

////        OutOfMemoryError
//        try {
//            int a[]=new int[Integer.MAX_VALUE];
//            System.out.println(a.length);
//        }catch (OutOfMemoryError e){
//            System.out.println(e);
//        }


//        NoClassDefFoundError  & ClassNotFoundException: this error occurs when we use the
//        particular in code but class exists then we get this type of error.
//                Basically ClassNotFoundException occur at program compile time.




    }

//    StackOverflowError
//    public static void stackOverFlow(){
//        try {
//            stackOverFlow();
//        }catch (StackOverflowError e){
//            System.out.println(e);
//        }
//    }
//    it occurac when method call itself again and again
//    without any condition like infinite then it become a bom
//            for memory stack then it will show stStackOverflowError
}
