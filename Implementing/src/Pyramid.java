public class Pyramid implements Solids {

	private double length, width, height;
	private String color, name;
	
	public Pyramid(double length, double width, double height, String color, String name) {
		this.length = length;
		this.width = width;
		this.height = height;
		this.color = color;
		this.name = name;
	}
	
	// Volume = length*width*height/3
	public double getVolume(){
		double volume = this.length * this.width * this.height / 3;
		return volume;
		//TODO: complete this method (based on the formula above)
	}
	
	public String getColor(){
		return this.color;
		//TODO: complete this method
	}
	
	public String getName(){
		return this.name;
		//TODO: complete this method 
	}
	
}