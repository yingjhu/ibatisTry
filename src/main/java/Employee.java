
public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	/* Define constructors for the Employee class. */
	public Employee() {
	}

	public Employee(String fname, String lname, int salary) {
		this.firstName = fname;
		this.lastName = lname;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("ID = %d: %s %s $%d", id, firstName, lastName,
				salary);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastnName) {
		this.lastName = lastnName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
