import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjInputStrm {
    public static void main(String[] args) throws Exception{
        FileInputStream f=new FileInputStream("D:\\java practice\\files.txt");
        ObjectInputStream file=new ObjectInputStream(f);

        Object obj=file.readObject();
        if(obj!=null && obj instanceof Employee[]){
            Employee e[]=(Employee[]) obj;
            for(int i=0;i<e.length;i++)
                System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t"+e[i].getSalary());
        }else {
            System.out.println("something wrong");
        }
    }
}
