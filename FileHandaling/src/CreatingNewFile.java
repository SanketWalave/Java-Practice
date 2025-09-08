import java.io.File;

public class CreatingNewFile {
    public static void main(String[] args)throws Exception {
        File f=new File("D:\\java practice\\sanket.js");
        System.out.println(f.createNewFile());
        // return boolean
    }
}
