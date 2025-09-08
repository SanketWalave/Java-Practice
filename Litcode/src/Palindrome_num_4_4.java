class Solutionp {
    public boolean isPalindrome(int x) {
            String s=String.valueOf(x);
        int mid=s.length()/2;
        int end=s.length()-1;
        for(int i=0;i<mid;i++)
        {
            if(s.charAt(i)!=s.charAt(end))
            {
                return false;
            }
            end--;
        }
        return true;
    }
}
public class Palindrome_num_4_4 {
    public static void main(String[] args) {
        Solutionp s=new Solutionp();
        System.out.println(s.isPalindrome(10));
    }
}
