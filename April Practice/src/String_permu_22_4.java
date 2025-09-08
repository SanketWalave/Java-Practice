import java.util.HashSet;

public class String_permu_22_4 {
    public static void main(String[] args) {
        String s="abc";
        HashSet<String> hs=new HashSet<String>();
       char str[]=s.toCharArray();
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str.length;j++){
                for(int k=0;k<str.length;k++)
                {
                    String w="";
                    if(i!=j && j!=k && i!=k){
                        System.out.println(str[i]+str[j]+str[k]);
//                       w = String.valueOf(str[i]+str[j]+str[k]);
//                       hs.add(w);
                    }

                }
            }
        }
//        System.out.println(hs);
    }
}
