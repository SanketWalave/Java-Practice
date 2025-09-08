package Practice_9_5;

/*Q5. WAP to store 10 string objects in ArrayList
 and perform the following operation on it.
Case 1: Add String data
Case 2: Search string ends with sh
Case 3: Search string start with r
Case 4: Count the number of word in every string
Case 5: Reverse the every word of string from ArrayList
*/
import java.util.*;

public class Q5_StringArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();
        do{
            System.out.println(" Enter your choice.\n" +
                    "Case 1: Add String data \n" +
                    "Case 2: Search string ends with sh \n" +
                    "Case 3: Search string start with r\n" +
                    "Case 4: Count the number of word in every string \n" +
                    "Case 5: Reverse the every word of string from ArrayList\n"+
                    "case 6: show\n"+
                    "case 7: exit");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter string");
                    sc.nextLine();
                    al.add(sc.nextLine());
                    break;
                case 2:
                    for(String s:al){
                        if(s.endsWith("sh")) System.out.println(s);
                    }
                    break;
                case 3:
                    for(String s:al){
                        if(s.startsWith("r")) System.out.println(s);
                    }
                    break;
                case 4:
                    for(int i=0;i<al.size();i++){
                        String s=al.get(i);
                        System.out.print(s);
                        s+=" ";
                        System.out.print("\t word count  ");
                        int count=1;
                        for(int j=0;j<s.length()-1;j++){
                            if(s.charAt(j)==' '&& (s.charAt(j+1)!=' '|| j+1==s.length())){
                                count++;
                            }
                        }
                        System.out.println(count);
                    }
                    break;
                case 5:
                    for(int i=0;i<al.size();i++){
                        String str=al.get(i);
                        al.set(i,getRev(str));
                    }
                    break;
                case 6:
                    System.out.println(al);
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        }while (true);
    }
    public static String getRev(String str){
        String w="";
        String w2="";
        str+=" ";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=32){
                w+=ch;
            }
            else{
                w2+=reverse(w)+" ";
                w="";
            }
        }
        return w2;
    }
    public static String reverse(String str2){
        char ch[]=str2.toCharArray();
        int end=ch.length-1;
        int mid=ch.length/2;
        for(int i=0;i<mid;i++){
            char temp=ch[i];
            ch[i]=ch[end];
            ch[end]=temp;
            end--;
        }
        str2=new String(ch);
        return str2;
    }
}
