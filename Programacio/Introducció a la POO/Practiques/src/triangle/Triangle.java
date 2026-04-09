package triangle;

public class Triangle {

    private double side1;
    private double side2;
    private double side3;


    public Triangle() {
        this.side1 = 3.0;
        this.side2 = 4.0;
        this.side3 = 5.0;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    
    public double perimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public double area() {
        double s = this.perimeter() / 2.0;
        double z = s * (s - side1) * (s - side2) * (s - side3);
        
        return Math.sqrt(z);
    }
    
    public String toString() {
        return "Triangle sides=" + side1 + ", " + side2 + ", " + side3 +
               " | perimeter=" + perimeter() +
               " | area=" + area();
    }
}