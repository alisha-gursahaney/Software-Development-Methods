
public class Square extends Shape {
	public Square(double height) {
		super(height);
	}
	// area of a square is height * height
	// ( a square has the same height and width! )
	// complete this method:
	public double calculateArea() {
		double area = (this.getHeight() * this.getHeight());
		return area;
		// be sure to change the return value
	}
	// also create a toString() method!
	Override
	public String toString() {
		/* change this value to return the String
		 * Circle with a height of ___ has an area of ___
		 * but fill in the blanks with the actual values
		 */
		return "Square with a height of" + this.getHeight() + "has an area of" + this.calculateArea();
	}
	/* change this value to return the String
	 * Square with a height of ___ has an area of ___
	 * but fill in the blanks with the actual values
	 */
}
