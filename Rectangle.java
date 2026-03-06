public class Rectangle extends Shape{
    
    private double width;
    private double height;

    public Rectangle() {
        super();
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area()  {
        return width * height;

    }

    @Override 
    public double perimeter() {
        return 2 * (width + height);
    
    }

    @Override
    public String toString() {
        return String.format("Rectangle [width=%.2f,height=%.2f,color=%s,area=%.2f,perimeter=%.2f]", 
            width, height, getColor(), area(), perimeter());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle r = (Rectangle)obj;
            return Double.compare(width, r.width) == 0 &&
                   Double.compare(height, r.height) == 0 &&
                   getColor().equals(r.getColor());
        }
        return false;

    }

}

