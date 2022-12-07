public class Sphere implements Solids {
	
	private double radius;
	private String color, name;
	
	public Sphere(double radius, String color, String name){
		this.radius = radius;
		this.color = color;
		this.name = name;
	}
	
	// Volume = 4/3*pi*r^3
	public double getVolume(){
		double volume = (4/3) * Math.PI * (this.radius * this.radius * this.radius);
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