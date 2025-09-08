import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CowentWordsInString  {
    public static void main(String[] args)throws Exception {
        File f=new File("D:\\SQL\\new 1.txt");
        FileWriter fr=new FileWriter(f);

        BufferedWriter fw=new BufferedWriter(fr);
        String str2="sanket walave";
        fw.write(str2);
        fw.newLine();
        fw.write(str2);
        fw.close();

        FileReader fr2=new FileReader(f);
        char ch[]=new char[(int) f.length()];
        String str="";
        fr2.read(ch);
        str= new String(ch);
        System.out.println(str);
    }
}
