import java.util.*;

//class Solutionrc{
//    public int lengthOfLongestSubstring(String s){
//        int mlength=0;
//       // HashMap<Integer,String> hm=new HashMap<Integer,String>();
//        String bigStr=s.substring(0,1);
//        for(int i=0;i<s.length();i++)
//        {
//            for(int j=i+mlength;j<=s.length();j++)
//            {
//                if(j-i>mlength && istrue(s.substring(i,j)))
//                {
//                    mlength=j-i;
//                    bigStr=s.substring(i,j);
//                   // hm.put(mlength,bigStr);
//
//                }
//            }
//        }
//        return mlength;
//    }
//    public boolean istrue(String s)
//    {
//        char ch[]=s.toCharArray();
//        for(int i=0;i<ch.length;i++)
//        {
//            for (int j=0;j<ch.length;j++)
//            {
//                if(ch[i]==ch[j] && i!=j)
//                {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//}
public class Long_SubStr_noRep_4_4 {
    public static void main(String[] args) {
//        Solutionrc s=new Solutionrc();
//        System.out.println(s.lengthOfLongestSubstring("asdfgh"));
        Scanner sc=new Scanner(System.in);
        System.out.println(lengthOfLongestSubstring("abcabcbbcdefg"));

    }
    public static  int lengthOfLongestSubstring(String str){
//        System.out.println("sanket");
        HashMap<Character,Integer> map=new HashMap<>();
        int maxLength=0;
        int l=0;
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))) {
//                System.out.println(l);
//                System.out.println(map.get(str.charAt(i))+"  "+str.charAt(i));
                if (l < map.get(str.charAt(i))+1) {
                    l = map.get(str.charAt(i))+1;
                }
            }
                int len=i-l+1;
                if(len>maxLength){
                    maxLength=len;
//                    System.out.println(maxLength);
//                    System.out.println(len);
                }
                map.put(str.charAt(i),i);
            }

        return maxLength;
    }
}
