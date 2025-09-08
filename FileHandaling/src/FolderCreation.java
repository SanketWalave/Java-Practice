import java.io.File;

public class FolderCreation {
    public static void main(String[] args) {
        File f=new File("D:\\UI\\sankett.js");
        // sanket is a file name that i have to create and that i write at the end of path
        // if file is olredy present then it not create file
//        boolean b=f.mkdir();
//        if(b)
//            System.out.println("true");
//        else
//            System.out.println("false");

//        for checking folder is olredy exist or not

        boolean exist=f.exists();
        System.out.println(exist);
    }
}
