import java.io.*;

public class GetRoots {
    public static void main(String[] args) {

        File f[]=File.listRoots();
        System.out.println(f);
        for(int i=0;i<f.length;i++) {
            System.out.println(f[i]);
            System.out.println(f[i].getTotalSpace()/1073741824-f[i].getFreeSpace()/1073741824);
            System.out.println(f[i].getFreeSpace()/1073741824);
        }
    }
}
