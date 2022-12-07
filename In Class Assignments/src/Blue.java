
public class Blue extends Green{
	public String method1() {
        return "Blue";
    }
	public static void main(String[] args) {     
		Green two = new Blue();
		two.method1();
}
}
