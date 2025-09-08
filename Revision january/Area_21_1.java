/*Q2. Write program to create class name Area with methods name as void setRadius(float radius) and
 void setLengthWidth(int len,int wid) and two child classes name as Circle and Rectangle so
 you have to define float getCircleArea() method in Circle child class and
 calculate area of circle and return it and You have to define getRectArea() method in Rectangle class and 
 calculate area of rectangle and return it.*/
 class Area
 {
	 protected float radius;
	 protected int len;
	 protected int wid;
	 void setRadius(float radius)
	 {
		 this.radius=radius;
	 }
	 void setLengthWidth(int len,int wid)
	 {
		 this.len=len;
		 this.wid=wid;
	 }
 }
 class Circle extends  Area
 {
	 float getCircleArea()
	 {
		 return 3.14f*radius*radius;
	 }
 }
 class Rectangle extends Area
 {
	 int getRectArea()
	 {
		 return len*wid;
	 }
 }
 public class Area_21_1
 {
	 public static void main(String x[])
	 {
		 Circle c=new Circle();
		 c.setRadius(10);
		 System.out.println("Area of circle        \t"+c.getCircleArea());
		 
		 Rectangle r=new Rectangle();
		 r.setLengthWidth(10,20);
		 System.out.println("Area of reactangle    \t"+r.getRectArea());
	 }
 }