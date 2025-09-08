import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        int end=ch.length-1,mid=(ch.length/2);
        System.out.println(mid);
        for(int i=0;i<mid;i++){
            char temp=ch[i];
            ch[i]=ch[end];
            ch[end]=temp;
            end--;

        }
        str=new String(ch);
        System.out.println(ch);
    }
}
