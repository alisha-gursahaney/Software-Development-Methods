/* 2 */

/* Employee Class extends the Person Class - Employee Class is the sub-class */
public class Employee extends Person {
	// Class fields - notice the access modifier is "protected"
	protected String workAddress;
	protected int employeeId;

	/* Constructor */
	public Employee(String n, String ha, String wa, int id) {
		super(n, ha); // Important! (Notice the number of parameters)
		workAddress = wa;
		employeeId = id;
	}
	
	/* Second Constructor - Not used in this way very often */
	public Employee(String wa, int id) {
		super("NameNotProvided", "HomeAddressNotProvided"); // use default values
		// super("John", "100 Main");
		workAddress = wa;
		employeeId = id;		
	}

	public static void main(String[] args) {
		Employee bob = new Employee("Bob", "101 Kenmore", "Rice 405", 700);
		System.out.println(bob);
		System.out.println(bob.getMailingAddress()); // calling the overridden method
		
		// What if you give partial information? Then *second* constructor would be used
		Employee clayton = new Employee("Olsson 120", 842);
		System.out.println(clayton);
	}

	@Override
	public String toString() {
		String str = super.toString(); // Calling Person's toString()
		str += " [workAddress=" + this.workAddress +
				", employeeId=" + this.employeeId + "]";
		return str;
	}	
	
	/* overriding getMailingAddress method from Person Class */
	/* Making it relevant to Employee - using workAddress rather than homeAddress */
	@Override
	public String getMailingAddress() {
		return this.name + ", " + this.workAddress;
	}
		
	/* toString method */
//	@Override
//	public String toString() {
//		return "Employee [name=" + this.name + ", homeAddress=" + this.homeAddress +
//				", workAddress=" + this.workAddress +
//				", employeeId=" + this.employeeId + "]";
//	}
	
	/* Getters and Setters */
	public String getWorkAddress() {
		return this.workAddress;
	}
	public void setWorkAddress(String workAddress) {
		this.workAddress = workAddress;
	}
	public int getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

}