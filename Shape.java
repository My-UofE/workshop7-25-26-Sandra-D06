public abstract class Shape {

    private String color;

    public Shape() {
        this.color = "red";
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double area();
    public abstract double perimeter();

    public static void main(String[] args) {
        Shape s1, s2, s3;

        s1 = new Rectangle(3.0, 4.0, "green");
        System.out.println(s1);

        s2 = new Rectangle(3.0, 4.0, "green");
        System.out.println(s2);
        System.out.println("Area = " + s2.area());
        System.out.println("Perimeter = " + s2.perimeter());

        s3 = new Triangle(3.0, 4.0, 5.0, "green");
        System.out.println(s3);

        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s2));

    }

    
}
