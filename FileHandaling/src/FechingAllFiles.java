import java.io.*;
public class FechingAllFiles {
    public static void main(String[] args) {
        File javaPractice=new File("D:\\java practice");
        System.out.println( javaPractice.exists());
        File f1[]=javaPractice.listFiles();
        int javacount=0;
        int foldercount=0;
        for (int i=0;i<f1.length;i++){
            if(f1[i].isDirectory()){
                foldercount++;
                File inFile[]=f1[i].listFiles();
                for(int j=0;j<inFile.length;j++){
                    System.out.println("\t\t\t"+inFile[j]);
                    javacount++;
                }
            }else {
                System.out.println(f1[i]);
                javacount++;
            }
        }
        System.out.println(foldercount);
        System.out.println(javacount);
    }
}
