
public class AreaTester {

	public static void main(String[] args) {
		
		double heightToCompare = 9.0;
		
		Circle c = new Circle(heightToCompare);
		Triangle t = new Triangle(heightToCompare);
		Square s = new Square(heightToCompare);
		
		System.out.println(c);
		System.out.println(t);
		System.out.println(s);
	}
}
