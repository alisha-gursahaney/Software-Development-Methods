
public class Triangle  extends Shape {
	
	public Triangle (double height) {
		super(height);
	}
	public double calculateArea() {
		double area = (this.getHeight() * this.getHeight()) /2;
		return area;
	}
	
	@Override
	public String toString() {
		return "Triangle with a height of" + this.getHeight() + "and a base of" + this.getHeight() + ",has an area of" + this.calculateArea();
	}
	// Assume the base of this triangle is equal to its height, ergo area of a triangle is (height * height) / 2

	// create the calculateArea method:
		
	// also create a toString() method!
}
