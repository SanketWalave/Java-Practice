import java.util.*;

/**/
public class StringComp_443 {
    public static void main(String[] args) {
        char ch[]={'a','a','b','b','c','c','c'};
        System.out.println(charCompair(ch));
    }
    public static int charCompair(char ch[]){
        int left=0;
        int count=1;
        for(int i=0;i<ch.length;i++){
            if(i+1<ch.length && ch[i]==ch[i+1]){
                count++;
            }else{
                ch[left++]=ch[i];
               if(count>1){
                   String str=Integer.toString(count);

                   for(int j=0;j<str.length();j++){
                       ch[left++]=str.charAt(j);
                   }
               }
                count=1;
            }
        }
        System.out.println(Arrays.toString(ch));
        return left;
    }
}
