class Table
{
    private int a;
    public void setValue(int a)
    {
        this.a=a;
    }
    public void getTable()
    {
        for (int i=1;i<=10;i++) System.out.println(a*i);
    }
}
public class Table_24_4 {
    public static void main(String[] args) {
        Table t=new Table();
        t.setValue(10);
        t.getTable();
    }
}
