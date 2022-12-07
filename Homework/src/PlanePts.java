// Alisha Gursahaney amg9zd and TuNhi Vo ntv6jq

public class PlanePts {
	public static double points(double x, double y) {
		double value;

		if (x >= 0 && y >= 0) {
			value = x*y ;
		} else if (x < 0 && y >= 0) {
			value = x-y;
		} else if (x < 0 && y < 0) {
			value = x/y;
		} else {
			value = x+y;
		}
		return value;
	}	
	public static void main(String[] args) {
		System.out.println(points(2,5));
		System.out.println(points(1.3,5.2));
		System.out.println(points(-1.9,-5.9));
		}
	}
