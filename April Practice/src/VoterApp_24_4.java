/*Q11. WAP Voting application using method with variable argos concept
Voter: id name and age mark as POJO class
VotingMachine: void acceptWord(Voter …v): accept the infinite voter
 if voter age is greater than 18 then display its data otherwise not
VotingMachineApp: this method cantais voter details and pass to VotingMachine class

*/

import java.util.*;

class Voter {
    private int id;
    private String name;
    private int age;

//    public Voter() {
//
//    }

    public Voter(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class VotingMachineApp{
    private Voter v[];
    public void acceptWord(Voter ...v){
        for(int i=0;i<v.length;i++)
        {
            if(v[i].getAge()>17)
            {
                System.out.println("voter id   \t"+v[i].getId());
                System.out.println("voter name \t"+v[i].getName());
                System.out.println("voter age  \t"+v[i].getAge());
                System.out.println("\n-------------------------------------\n");
            }
        }
    }
}
public class VoterApp_24_4 {
    public static void main(String[] args) {
            Voter v1=new Voter(1,"Sanket",22);
            Voter v2=new Voter(3,"Sanket",2);
            Voter v3=new Voter(2,"Sanket",40);

            VotingMachineApp vapp=new VotingMachineApp();
            vapp.acceptWord(v1,v2,v3);
    }
}
