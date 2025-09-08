import java.io.File;
import java.io.FileReader;

public class Litcode_Count {
    public static void main(String[] args) throws Exception {
        File f=new File("D:\\java practice\\Litcode\\src");
        File files[]=f.listFiles();
        int count=0;
        for(int i=0;i<files.length;i++){
            System.out.println(files[i]);
            count++;
        }
        System.out.println("count of files "+count);

    }
}
