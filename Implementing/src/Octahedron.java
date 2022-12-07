
public class Octahedron implements Solids{
	
	private double edge;
	private String color, name;
	
	public Octahedron(double edge, String color, String name){
		this.edge = edge;
		this.color = color;
		this.name = name;
	}
	
	// Volume = [(square root of 2)/3]  * edge^3  [Note: edge^3 is edge-cubed]
	public double getVolume(){
		double volume = (Math.sqrt(2) / 3) * (this.edge * this.edge * this.edge);
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