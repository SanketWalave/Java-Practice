import java.io.*;

public class CountWords {
    public static void main(String[] args) throws Exception{
//        try {
//            FileReader fr=new FileReader("D:\\java practice\\sanket.js");
//            int ch;
//            int count=1;
//            while ((ch=fr.read())!=-1){
//                System.out.print((char)ch);
//                if(ch==32){
//                    count++;
//                }
//            }
//            System.out.println(count);
//        }catch (Exception e){
//            System.out.println(e);
//        }

//        try {
//            FileReader fr=new FileReader("D:\\java practice\\sanket.js");
//            BufferedReader br=new BufferedReader(fr);
//            String line="";
//            while ((line=br.readLine())!=null){
//                System.out.println(line);
//            }
////            int ch;
////            int count=1;
////            while ((ch=fr.read())!=-1){
////                System.out.print((char)ch);
////                if(ch==32){
////                    count++;
////                }
////            }
////            System.out.println(count);
//        }catch (Exception e){
//            System.out.println(e);
//        }


        File f=new File("D:\\SQl\\new 1.txt");
        FileReader fr=new FileReader(f);
        char ch[]=new char[(int)f.length()];
        fr.read(ch);
        fr.close();
        int count=1;
        for (int i=0;i<ch.length-1;i++){
            if(ch[i]==32 && (ch[i+1]!=32 || i+1==ch.length-1)){
                count++;
            }
        }
        System.out.println(count);
    }
}
