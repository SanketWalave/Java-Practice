import java.util.Scanner;

class Solution {
    public String longestPalindrome(String s) {
        int mlength=0;
        String mstr=s.substring(0,1);
        char[] ch =s.toCharArray();
        for(int st=0;st<s.length();st++)
        {
            for(int end=st+mlength;end<=s.length();end++)
            {
                if(end-st>mlength && isPalindrome(s.substring(st,end)))
                {
                    mlength=end-st;
                    mstr=s.substring(st,end);

                }
            }
        }
        return mstr ;
    }
    public boolean isPalindrome(String str)
    {
//        int mid=str.length()/2;
        int st=0;int end=str.length()-1;
        while(st < end)
        {
            if(str.charAt(st)!=str.charAt(end))
            {
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}
public class LongestPalindromeSubstring
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
//        System.out.println(str);
        Solution s=new Solution();
        String ans=s.longestPalindrome("abcdadc");
        System.out.println(ans);
    }
}
/*int tempst=st;
                int tempend=end;
                boolean flag=true;
                int mid=end/2;
                for(int i=tempst;i<=mid;i++)
                {
                    if(ch[i]!=ch[tempend])
                    {
                        flag=false;

                        break;
                    }

                    tempend--;

                }
                String w="";
                if(flag)
                {
                    for(int i=st;i<=end;i++)
                    {
                        w+=ch[i];
                    }
                    //System.out.println();

                }
                if(w.length()>bigW.length())
                {
                    bigW=w;
                }*/