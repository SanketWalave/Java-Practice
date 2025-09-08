import java.io.FileOutputStream;
import java.io.*;

public class ObjectOutputStreemApp {
    public static void main(String[] args) throws Exception{
        FileOutputStream file=new FileOutputStream("D:\\java practice\\files.txt");
        ObjectOutputStream ofile=new ObjectOutputStream(file);

        Employee emp=new Employee();
        emp.setId(2);
        emp.setName("rfhub");
        emp.setSalary(3456);
        System.out.println(emp.getId());
        ofile.writeObject(emp);
        ofile.close();

    }
}
