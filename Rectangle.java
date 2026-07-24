import java.util.*;
class Rectangle
{
   double a,p,l,w;
   void read()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter length of the rectangle:");
       l=sc.nextDouble();
       System.out.println("Enter width of the rectangle:");
       w=sc.nextDouble();
   }
   void perimeter()
   {
       p=2*(l+w);
       System.out.println("Perimeter : "+p);
   }
   void area()
   {
       a=l*w;
       System.out.println("Area : "+a);
   }
   public static void main(String args[])
   {
       Rectangle r = new Rectangle();
       r.read();
       r.perimeter();
       r.area();
   }
}