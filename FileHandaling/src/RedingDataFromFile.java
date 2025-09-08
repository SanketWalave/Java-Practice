import java.io.File;
import java.io.FileReader;

public class RedingDataFromFile {
    public static void main(String[] args) throws Exception{
        FileReader fw=new FileReader("d:\\java practice\\sanket.js");
        System.out.println();
        int character;
        while ((character=fw.read())!=-1){
            System.out.print(((char)character));
        }
    }
}
