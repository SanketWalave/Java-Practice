package Practice_9_5;

public class CheckPAlindrome {
    public static void main(String[] args) {
        System.out.println(isPAl("A man a plan a canal Panama"));
    }
    public static boolean isPAl(String s){
        String str=s.toLowerCase();
        String str2="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')continue;
            str2+=str.charAt(i);
        }
        System.out.println(str2);
        char ch[]=str2.toCharArray();
        int end=ch.length-1;
        int mid=ch.length/2;
        for(int i=0;i<mid;i++){
            if(ch[i]!=ch[end])return false;
            end--;
        }
        return true;
    }
}
