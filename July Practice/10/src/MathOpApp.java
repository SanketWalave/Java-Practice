import java.util.*;
/*Q1. Write a program to crate class name as Value with single function name as setValue(int,int) and
we have to create three child classes name as Add with function int getAdd() , Mul with function
getMul() and Div with function getDiv()  and getAdd() function return addition of two value which  is
inherited from Value class , getMul() function return multiplication of two values which is  inherited
from Value class and gitDiv() function return division of two values which Is inherited from Value
class.*/
class Value_1{
    protected int a;
    protected int b;
    public void setValue(int a,int b){
        this.a=a;
        this.b=b;
    }

}
class GetAdd extends Value_1{
    public int getRes(){
        return a+b;
    }
}
class GetMul extends Value_1{
    public int getRes(){
        return a*b;
    }
}
class GetDiv extends Value_1{
    public int getRes(){
        return a/b;
    }
}
public class MathOpApp {
    public static void main(String[] args) {
       GetAdd ga=new GetAdd();
       ga.setValue(10,10);
       GetMul gm=new GetMul();
       gm.setValue(10,10);
       GetDiv gd=new GetDiv();
       gd.setValue(10,10);
        System.out.println(ga.getRes());
        System.out.println(gm.getRes());
        System.out.println(gd.getRes());
    }
}
