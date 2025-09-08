/*2. Create a LightBulb class
Create a LightBulb class with a field state (boolean).
Use the default constructor to set the bulb to off (false).
Add methods turnOn() and turnOff() to toggle the state and display the current state.
   Explanation: Covers state management in an object and logic toggling.
*/
class LightBulb
{
   private boolean b;
   LightBulb()
   {
      this.b=false;
   }
   void turnOn()
   {
    b=true;
   }
   void turnOff()
   {
       b=false;
   }
   void show()
   {
      if(b)
         System.out.println("bulb is onn");
      else 
         System.out.println("bulb is off"); 
   }
}
public class  Bulb_18_1
{
   public static void main(String x[])
   {
      LightBulb l=new LightBulb();
      l.turnOn();
      l.turnOff();
      l.show();


   }
}