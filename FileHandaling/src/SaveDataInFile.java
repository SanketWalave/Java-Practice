import java.util.*;
import java.io.*;

public class SaveDataInFile {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);

        FileWriter fw=new FileWriter("D:\\java practice\\sanket.js",true);
        System.out.println("enter string");
        String str=sc.nextLine();
        fw.write(str);
        fw.close();
    }
}
