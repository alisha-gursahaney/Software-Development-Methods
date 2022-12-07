
public class Shape {

	private double height;
	
	public Shape () {
		height = 0.0;
	}
	public Shape (double height){
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	@Override
	public String toString() {
		return "This shape has a height of " + this.height + " and an unknown form. Area cannot be calculated.";
	}

}
