import java.util.ArrayList;

public class probability {
	
	public static double rayleigh() {
		double u = 0;
		double count = 0;
		double x = 1000.0;
		double a = 24693;
		double c = 3967;
		double k = Math.pow(2, 18);
		double sum = 0;
		// int n = 1000;
		while (count < 1) {
			double y = ((a*x) + c) % k;
			u = y/k; 
			x = y;
			count += 1;
			sum += x;
			return x;
		}
		double fx = Math.sqrt((-2*Math.log(1-x))/(a*a));
		return fx;
		
	}
	
	public static void main(String[] args) {

		ArrayList<Double> n10 = new ArrayList<Double>();
		for(int j=0; j<110; j++) {
			double sum10 = 0;
			int cap10 = 10;
			for(int i=0; i<cap10; i++) {
				sum10 = sum10 + rayleigh();
			}
			double mean10 = sum10/cap10;
			n10.add(mean10);
		}
		ArrayList<Double> n30 = new ArrayList<Double>();
		for(int j=0; j<110; j++) {
			double sum30 = 0;
			int cap30 = 30;
			for(int i=0; i<cap30; i++) {
				sum30 = sum30 + rayleigh();
			}
			double mean30 = sum30/cap30;
			n30.add(mean30);
		}
		ArrayList<Double> n50 = new ArrayList<Double>();
		for(int j=0; j<110; j++) {
			double sum50 = 0;
			int cap50 = 50;
			for(int i=0; i<cap50; i++) {
				sum50 = sum50 + rayleigh();
			}
			double mean50 = sum50/cap50;
			n50.add(mean50);
		}
		ArrayList<Double> n100 = new ArrayList<Double>();
		for(int j=0; j<110; j++) {
			double sum100 = 0;
			int cap100 = 100;
			for(int i=0; i<cap100; i++) {
				sum100 = sum100 + rayleigh();
			}
			double mean100 = sum100/cap100;
			n100.add(mean100);
		}
		ArrayList<Double> n250 = new ArrayList<Double>();
		for(int j=0; j<110; j++) {
			double sum250 = 0;
			int cap250 = 250;
			for(int i=0; i<cap250; i++) {
				sum250 = sum250 + rayleigh();
			}
			double mean250 = sum250/cap250;
			n250.add(mean250);
		}
		ArrayList<Double> n500 = new ArrayList<Double>();
		for(int j=0; j<110; j++) {
			double sum500 = 0;
			int cap500 = 500;
			for(int i=0; i<cap500; i++) {
				sum500 = sum500 + rayleigh();
			}
			double mean500 = sum500/cap500;
			n500.add(mean500);
		}
		ArrayList<Double> n1000 = new ArrayList<Double>();
		for(int j=0; j<110; j++) {
			double sum1000 = 0;
			int cap1000 = 1000;
			for(int i=0; i<cap1000; i++) {
				sum1000 = sum1000 + rayleigh();
			}
			double mean1000 = sum1000/cap1000;
			n1000.add(mean1000);
		}

		
		System.out.println(n10);
		// System.out.println(n30);
		// System.out.println(n50);
		// System.out.println(n100);
		// System.out.println(n250);
		// System.out.println(n500);
		// System.out.println(n1000);
		// System.out.println(sum30);
		// System.out.println(sum10);

		}
}