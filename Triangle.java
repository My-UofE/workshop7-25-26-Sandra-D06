public class Triangle extends Shape {
    
    private double a, b, c;

    public Triangle(double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return String.format("Triangle[a=%.2f,b=%.2f,c=%.2f,color=%s,area=%.2f,perimeter=%.2f]",
        a, b, c, getColor(), area(), perimeter());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Triangle) {
            Triangle t = (Triangle)obj;
            return Double.compare(a, t.a) == 0 &&
                   Double.compare(b, t.b) == 0 &&
                   Double.compare(c, t.c) == 0 &&
                   getColor().equals(t.getColor());
        }
        return false;
    }
}

