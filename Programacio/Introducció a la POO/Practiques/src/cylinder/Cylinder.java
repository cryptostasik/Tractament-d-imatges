package cylinder;

public class Cylinder {
	private Circle base;
	private double height;
	
	public Circle getBase() {
		return base;
	}
	public void setBase(Circle base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public Cylinder (double radius,double height ) {
		this.base = new Circle(radius);
		this.height = height;
	}
	
	public Cylinder (Circle base,double height ) {
		this.base = base;
		this.height = height;
	}
	
	public double getVolume() {
		return (base.getArea() * 2) * this.height;
	}
	public double getSurfaceArea() {
		return (2 * Math.PI * this.radius * this.height) + (2 * base.getVolume);
	}
}
