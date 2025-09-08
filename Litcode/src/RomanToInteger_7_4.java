/*Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000*/
class Roman
{
    public int romanToInt(String s) {
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!='I' || ch!='V'|| ch!='X'|| ch!='L'|| ch!='C'|| ch!='D'|| ch!='M')
                return 0;
        }
//        int M=1000;
//        int D=500;
//        int C=100;
//        int L=50;
//        int X=10;
//        int V=5;
//        int I=1;
        int res=0;
        char n[]=s.toCharArray();
        for(int i=n.length-1;i>=0;i--)
        {

            if(n[i]=='I')
            {
                res+=1;
            }
            if(n[i]=='V')
            {
                res+=5;

               for(int j=1;j<4;j++)
                {
                    if(n[i-j]=='I')
                        res-=1;
                }
            }
        }

        return 0;
    }
}
public class RomanToInteger_7_4 {
    public static void main(String[] args) {

    }
}
