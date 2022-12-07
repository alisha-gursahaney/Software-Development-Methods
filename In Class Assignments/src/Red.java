public class Red extends Green {
    public void method2() {
        System.out.println("Red");
    }
	
	public static void main(String[] args) {     
		Object five = new Red();
		five.method1();
	}
}