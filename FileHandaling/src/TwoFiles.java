import java.io.*;
import java.util.HashMap;
import java.util.Map;

/*10. Problem:
You are given two text files students1.txt and students2.txt. Each line contains student data in this
format: rollno,name,marks.
Write a Java program to merge both files into a third file merged.txt but do not include students with
duplicate roll numbers.
Constraints:
• Use BufferedReader and FileWriter
• Optimize using HashSet to track duplicates
• Handle IOException properly*/
public class TwoFiles {
    public static void main(String[] args)throws Exception {
//        FileOutputStream f1a=new FileOutputStream("D:\\students1");
//        FileOutputStream f2a=new FileOutputStream("D:\\students2");
//        ObjectOutputStream file1add=new ObjectOutputStream(f1a);
//        ObjectOutputStream file2add=new ObjectOutputStream(f2a);
//
//        Student s[]=new Student[5];
//        s[0]=new Student("sanket",1,1234);
//        s[1]=new Student("sanket",5,1234);
//        s[2]=new Student("sanket",2,1234);
//        s[3]=new Student("sanket",3,1234);
//        s[4]=new Student("sanket",4,1234);
//
//        file1add.writeObject(s);
//        file1add.close();
//        Student s2[]=new Student[5];
//        s2[0]=new Student("sanket",1,1234);
//        s2[1]=new Student("sanket",5,1234);
//        s2[2]=new Student("sanket",2,1234);
//        s2[3]=new Student("sanket",3,1234);
//        s2[4]=new Student("sanket",4,1234);
//        file2add.writeObject(s2);
//        file2add.close();

        FileInputStream f1=new FileInputStream("D:\\students1");
        FileInputStream f2=new FileInputStream("D:\\students2");
        ObjectInputStream file1=new ObjectInputStream(f1);
        ObjectInputStream file2=new ObjectInputStream(f2);

        Student stud1[]=(Student[]) file1.readObject();
        Student stud2[]=(Student[]) file2.readObject();
        for(Student studen:stud1){
            System.out.println(studen.toString());
        }
        for(Student studen:stud2){
            System.out.println(studen.toString());
        }

        FileOutputStream file3=new FileOutputStream("D:\\students3");
        ObjectOutputStream f3=new ObjectOutputStream(file3);

        Map<Integer,Student> map=new HashMap<>();
        for(Student studen:stud1){
           map.put(studen.getRollno(),studen);
        }
        for(Student studen:stud2){
            map.put(studen.getRollno(),studen);
//            System.out.println(studen.toString());
        }
        System.out.println(map);
        int k=0;
        Student s3[]=new Student[map.size()];
        for(Map.Entry<Integer,Student> m:map.entrySet()){
            Student ss3=(Student) m.getValue();
            s3[k]=ss3;
            k++;
        }
        System.out.println("================================");
        for(Student si:s3){
            System.out.println(si.toString());
        }

        f3.writeObject(s3);
        f3.close();

        FileInputStream file3get=new FileInputStream("D:\\students3");
        ObjectInputStream f3get=new ObjectInputStream(file3get);

        System.out.println("++++++++++++++++   third file   ++++++++++++++");
        Student s3getstud[]=(Student[]) f3get.readObject();
        for(Student student:s3getstud){
            System.out.println(student.toString());
        }

    }
}
/*
*
*/