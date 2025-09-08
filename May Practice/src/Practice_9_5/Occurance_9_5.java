package Practice_9_5;

public class Occurance_9_5 {
    public static void main(String[] args) {
        System.out.println(getRes("aaabbcd"));
    }
    public static String getRes(String str){
        str+="////";
        String str2="";
        char ch[]=str.toCharArray();
        int count=1;
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]==ch[i+1]){
                count++;
            }
            else {
                str2=str2+ch[i]+count;//(char)count;
//                System.out.println(ch[i]+" "+count);
                count=1;
            }
        }
        return str2;
    }
}
