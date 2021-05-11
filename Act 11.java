import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);      
         double length = scan.nextDouble();
         Square s = new Square(length);
         System.out.printf("%.2f ",s.getPerimeter());
         System.out.printf("%.2f\n",s.getArea());
 
         length = scan.nextDouble();
         double wide = scan.nextDouble();
         Rectangle r = new Rectangle(length,wide);
         System.out.printf("%.2f ",r.getPerimeter());
         System.out.printf("%.2f\n",r.getArea());
 
         double radius = scan.nextDouble();
         Circle c = new Circle(radius);
         System.out.printf("%.2f ",c.getPerimeter());
         System.out.printf("%.2f\n",c.getArea());
 
         scan.close(); 
    }
}
abstract class Shape{
    public abstract double getArea();
 
    public abstract double getPerimeter();
 
}
 
class Square extends Shape{
 
    private double length;
 
    public Square(double length)
 
    {
 
        this.length = length;
 
    }
 
    public double getArea()
 
    {
 
        return length*length;
 
    }
 
    public double getPerimeter()
 
    {
 
        return 4 * length;
 
    }
 
}
 
class Rectangle extends Square{
 
    private double length;
 
    private double wide;
 
    
 
    public Rectangle(double length,double wide)
 
    {
 
        super(length);
 
        this.length = length;
 
        this.wide = wide;
 
    }
 
    public double getArea()
 
    {
 
        return length*wide;
 
    }
 
    public double getPerimeter()
 
    {
 
        return (length+wide)*2;
 
    }
 
}
 
class Circle extends Shape{
 
    private double radius;
 
    
 
    public Circle(double radius)
 
    {
 
        this.radius = radius;
 
    }
 
    public double getArea()
 
    {
 
        return 3.1415926*radius*radius;
 
    }
 
    public double getPerimeter()
 
    {
 
        return 3.1415926*2*radius;
 
    }
 
}