/*
 * Another test driver for the Cylinder class.
 */
public class TestCylinder2 {
    public static void main(String[] args) {
       Cylinder cy2 = new Cylinder(5.0, 2.0);

       double h = cy2.getHeight();
       double r = cy2.getRadius();
       double a = cy2.getArea();
       double v = cy2.getVolume();

       System.out.printf("Height: %.2f, Radius: %.2f, Area: %.2f, Volume: %.2f\n", h, r, a, v);
       
       // Instance method tests
       System.out.println("Circle c3: ");
       Circle c3 = new Circle();
       c3.printClassInfo();
       
       System.out.println("Cylinder cy4: ");
       Cylinder cy4 = new Cylinder();
       cy4.printClassInfo();
       
       System.out.println("Circle cy5: ");
       Circle cy5 = new Cylinder();
       cy5.printClassInfo();
       
       // Static method tests
       System.out.println("Static method: ");
       cy4.printClassInfoStatic();
       cy5.printClassInfoStatic();

    }

}