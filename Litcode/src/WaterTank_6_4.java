class Solutionwt {
    public int maxArea(int[] height) {
        int a[]=height;
        int maxarea=0;

        int left=0;
        int right=a.length-1;
        while(left<right)
        {
            int area=0;

            if(a[left] < a[right])
            {
                area=a[left]*(right-left);
                left++;
            }
            else {
                area=a[right]*(right-left);
                right--;
            }

            if(area>maxarea)
                maxarea=area;


        }
        return maxarea;
    }
}
public class WaterTank_6_4 {
    public static void main(String[] args) {
        Solutionwt s=new Solutionwt();
        int a[]={8,7,2,1};
        System.out.println(s.maxArea(a));
    }
}
