/*Q1. Example: WAP to find the max consecutive 1 and 0’s in binary array
 
1   1   0    0   1  0  1  0  1   1   1	1
Output: Max number of consecutive 1’s in the array is 4 from index 8-11
*/
public class Binary_Max_consicative {
    public static void main(String x[]) {
        int a[] = {1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1};
        int count2 = 0, count1 = 1, start = 0, end = 0, bin = a[0]; 
        int tempStart = 0;  
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {  
                count1++;
                end = i;  
            } else {  
                
                if (count1 > count2) {
                    count2 = count1;
                    start = tempStart;
                    bin = a[i - 1]; 
                }
                count1 = 1;  
                tempStart = i; 
            }
        }

       
        if (count1 > count2) {
            count2 = count1;
            start = tempStart;
            bin = a[a.length - 1];
        }

        System.out.println("Max number of consecutive " + bin + " in the array is " + count2 + " from index " + start + "-" + end);
    }
}
