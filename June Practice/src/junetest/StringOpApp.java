package junetest;
/* Q2. WAP to Create class name as StringOperation with a  parameterized constructor.
 StringOperation(String): this constructor can accept the string data.
 displayAlphabet()
{
//this function use implement the logic.
Input : - Indian
 Search Value : - d
 Output : - n  i
}*/
import java.util.*;
class StringOp{
    private String str;
    public StringOp(String str){
        this.str=str;
    }
    public void displayAlphabate(char ch){
        for(int i=0;i<str.length();i++){
            try{
            if(str.charAt(i)==ch  ) {
                if (i != 0 && i != str.length()) {
                    System.out.println(str.charAt(i - 1) + " " + str.charAt(i + 1));
                } else {
                    System.out.println("character at first or last index");
                }
            }
            }catch (Exception e){
                System.out.println(e);
            }

        }
    }
}

public class StringOpApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        StringOp so=new StringOp(sc.nextLine());
        System.out.println("enter character");
        so.displayAlphabate(sc.next().charAt(0));

    }
}
