class SingolTone{
    private static SingolTone instance;
    private SingolTone(){
        System.out.println("singoltone inst");
    }
    public static SingolTone getInstance(){
        if(instance==null){
            System.out.println("enter ");
            instance=new SingolTone();
        }
        return instance;
    }
}
public class SingolTone123 {
    public static void main(String[] args) {
        SingolTone s=SingolTone.getInstance();
        SingolTone s2=SingolTone.getInstance();
        System.out.println(s==s2);

    }
}
