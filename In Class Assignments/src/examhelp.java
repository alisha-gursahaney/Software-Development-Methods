
public class examhelp {
	    public static void main (String[] args) {
	        try {
	            int a = 0;
	            System.out.print("a = " + a + ", ");
	            int b = 20 / a;
	            System.out.print("b = " + b + ", ");
	        } catch(ArithmeticException e) {
	            System.out.print("Divide by zero error, ");
	        } finally {
	            System.out.print("inside the finally block, ");
	        }
	    }
	}
