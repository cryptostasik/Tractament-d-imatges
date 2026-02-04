package cylinder;

public class Circle {
    
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    

    public double getRadius() {
        return this.radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
    

    public boolean isGreat(Circle anotherCircle){
    	if (this.radius > anotherCircle.getRadius()) {
    		return true;
    	}
    	return false;
    }
    
    public Circle theGreatest(Circle anotherCircle) {
    	if (this.radius > anotherCircle.getRadius()) {
    		return this;
    	}
    	return anotherCircle;
    }
    
    @Override
	public String toString() {
		return "[radius=" + radius + ", getPerimeter()=" + getPerimeter() + ", getArea()=" + getArea() + "]";
	}
}