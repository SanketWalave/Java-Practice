import java.io.*;
import java.util.*;

public class CreateFileWithScanner {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter file name");
        String fl=sc.nextLine();
        String finalpath="D:\\SQL\\"+fl+".txt";
        System.out.println(finalpath);
        File file=new File(finalpath);
        FileWriter fw=new FileWriter(file,true);
        System.out.println("enter data");
//        sc.nextLine();
        String data=sc.nextLine();
        fw.write(data);
        fw.close();
        System.out.println("data in file");
        FileReader fr=new FileReader(file);
        int ch;
        while ((ch=fr.read())!=-1){
            System.out.print((char)ch);
        }
        fr.close();
    }
}
