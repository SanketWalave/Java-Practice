import java.io.*;
import java.util.*;

public class SaveOnNewLine {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        FileWriter  fw=new FileWriter("D:\\java practice\\sanket.js",true);
        BufferedWriter fbw=new BufferedWriter(fw);

        fbw.write("console.log(\"this is string\")");
        fbw.newLine();
        /* when this function use it add a new line at last
        * like as \n*/

        fbw.write("console.log(\"this is string\")");
        fbw.close();
        fw.close();


    }
}
