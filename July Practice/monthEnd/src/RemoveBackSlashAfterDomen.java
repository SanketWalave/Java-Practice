public class RemoveBackSlashAfterDomen {
    public static void main(String[] args) {
        System.out.println((int)'\\');
        System.out.println(getRes("jknvjfnjnj\\8\\\\\\\\"));
    }
    public static String getRes(String str){
        int count=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==92 )//&& str.charAt(i-1)=='\\')
            {
                count++;
            }else if (str.charAt(i)!=92){
                break;
            }
        }
        return str.substring(0,str.length()-count);
    }
}
