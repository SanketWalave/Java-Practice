import java.io.*;
import java.util.Scanner;

public class InputStreemApp {
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);

        FileOutputStream file=new FileOutputStream("D:\\java practice\\files.txt");
        String str=sc.nextLine();
        byte b[]=str.getBytes();
        file.write(b);
        file.close();
        System.out.println("added sucsessfuly");

    }
}
