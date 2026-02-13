package cylinder;

public class Cylinder {
    
    private Circle base;
    private double height;
    

    public Cylinder(double radius, double height) {
        this.base = new Circle(radius);
        this.height = height;
    }
    
    public Circle getBase() {
        return base;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getVolume() {
        return base.getArea() * height;
    }
    
    public double getTotalSurfaceArea() {
        return 2 * base.getArea() + base.getPerimeter() * height;
    }
    
    public boolean isLargerThan(Cylinder other) {
        return this.getVolume() > other.getVolume();
    }
    
    public Cylinder getLarger(Cylinder other) {
        if (this.getVolume() >= other.getVolume()) {
            return this;
        }
        return other;
    }
    
    @Override
    public String toString() {
        return String.format("Cylinder [radius=%.2f, height=%.2f, volume=%.2f, surface=%.2f]",
                             base.getRadius(), height, getVolume(), getTotalSurfaceArea());
    }
}