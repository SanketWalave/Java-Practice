public class NullPointer_29_3_4 {
    public static void main(String[] args) {
        int a[]=new int[5];
        for(int i=0;i<a.length-2;i++)
        {
            a[i]=i*5;
        }
        try{
            for(int i=0;i<a.length+3;i++)
                System.out.print(a[i]+" ");
        }
        catch(IndexOutOfBoundsException ex)
        {
            System.out.println("\n"+ex);
        }
        System.out.println("logic");
    }
}
