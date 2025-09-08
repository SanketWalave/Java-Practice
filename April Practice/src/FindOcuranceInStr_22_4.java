public class FindOcuranceInStr_22_4 {
    public static void main(String[] args) {
      int res=  getIndex("sanket",'d');
      if(res!=-1)
        System.out.println(res);
      else
        System.out.println("not found");
    }
    public static int getIndex(String str,char ch)
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
                return i;
        }
        return -1;
    }
}
