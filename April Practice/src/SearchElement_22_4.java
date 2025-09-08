public class SearchElement_22_4 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int skey=5;
        if(getElement(a,skey)!=-1)
            System.out.println("element found");
        else
            System.out.println("element not found");

    }
    public static int getElement(int a[],int skey)
    {
        int left=0;
        int end=a.length-1;
        while(left<=end)
        {
            int mid=left+(end-left)/2;
//            if(mid>skey){left=mid+1;}
//            else if(mid<skey){end=mid-1;}
//            else return mid;
            if (a[mid] == skey) {
                return mid; // Element found at index mid
            } else if (a[mid] < skey) {
                left = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }
        }
        return -1;
    }
}
