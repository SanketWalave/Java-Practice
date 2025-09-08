public class StartwithSubstr_22_4 {
    public static void main(String[] args) {
        String s="hello";
        String st="hd";
        int l=st.length();
        for(int i=0;i<s.length();i++)
        {

            if(s.substring(i,l).equals(st)){
                System.out.println(true);
            }
            else {

            }
            break;

        }
    }
}
