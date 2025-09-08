import java.io.*;

public class CreateFolder_1 {
    public static void main(String[] args) {
//        File f[]=File.listRoots();
//        File f=new File("D:\\java practice\\FileHandaling\\sanket\\demo.java");
//        boolean b=f.mkdir();
//        if(b) System.out.println("created");
//        else System.out.println("not");
//        for(int i=0;i<f.length;i++){
//            long size=f[i].getTotalSpace()-f[i].getFreeSpace();
//            long freespace=f[i].getFreeSpace();
//            System.out.println(f[i]+" storage  "+(size/1073741824)+" GB   free space  "+(freespace/1000000)/1024+" GB");
//        }
        File path=new File("D:\\java practice");
        File f[]=path.listFiles();
        int count=0;
        int count2=0;
        for(int i=0;i<f.length;i++){
            if(f[i].isDirectory()){
                System.out.println(f[i]);

                File f2[]=f[i].listFiles();
                for(int j=0;j<f2.length;j++){
                    System.out.println("\t\t\t"+f2[i]);
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
