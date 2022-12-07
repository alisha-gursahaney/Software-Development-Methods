
public class Circle extends Shape {
	
	public Circle(double height) {
		super(height);
	}
	
	// area of a circle is (height /2 ) ^ 2 * pi
	// hint - Java makes pi available as a constant, Math.PI
	// complete this method:
	public double calculateArea() {
		
		double area = (this.getHeight()/2) * (this.getHeight()/2) * Math.PI;
		
		// be sure to change the return value
		return area;
	}
	
	@Override
	public String toString() {
		/* change this value to return the String
		 * Circle with a height of ___ has an area of ___
		 * but fill in the blanks with the actual values
		 */
		return "Circle with a height of" + this.getHeight() + "has an area of" + this.calculateArea();
	}

}
