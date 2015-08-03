package employee;

public class Manager extends Employee {

	private String vacation;
	
	/**
	 * 
	 */
	public Manager() {
		super();
	}

	public Manager(String name, int age, int id, int experience, double salary,
			String vacation) {
		super(name, age, id, experience, salary);
		this.vacation = vacation;
	}

	public String getVacation() {
		return vacation;
	}

	public void setVacation(String vacation) {
		this.vacation = vacation;
	}

	@Override
	public String toString() {
		return "Manager name is " + super.toString() + "\nand vacation in " + vacation;
	}

	@Override
	public void addEmployee() {
		System.out.println("Creation of new Manager. Please enter details");
		System.out.println("---------------------------------------------");
		this.addBasicDetails();
		System.out.print("Vacation:");
		this.setVacation(input.next());
		
	}

	@Override
	public void printSalary() {
		System.out.println("Manager " + getName() + " salary is " + countTotalSalary());
		
	}

	@Override
	public double countTotalSalary() {
		return getSalary();
	}
	
}
