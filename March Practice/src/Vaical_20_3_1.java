import java.util.Scanner;
abstract class Vechile
{
    public abstract void ingine();
}
class Car extends Vechile
{
    public void ingine()
    {
        System.out.println("Heay i am Car");
    }
}
class Bike extends Vechile
{
    public void ingine()
    {
        System.out.println("Heay i am Bike");
    }
}
abstract class Production
{
    abstract Vechile getProduction(Vechile v);
}
class CarProduction extends Production
{
    public Vechile getProduction(Vechile v)
    {
        v.ingine();
        return null;
    }
}
class BikeProduction extends Production
{
    public Vechile getProduction(Vechile v)
    {
        v.ingine();
        return null;
    }
}
public class Vaical_20_3_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     System.out.println("asdfghjkl");
        Car c=new Car();
        Bike b=new Bike();

        CarProduction cp=new CarProduction();
        cp.getProduction(c);

    }
}
