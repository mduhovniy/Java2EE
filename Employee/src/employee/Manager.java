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
		this.addBasicDetails();
		System.out.print("Vacation:");
		this.setVacation(Input.getNewString());
		
	}

	@Override
	public void printSalary() {
		System.out.println("Manager " + getName() + " salary is " + countTotalSalary()
				+ " in $" + (float)(countTotalSalary() / getDollarRate()));
		
	}

	@Override
	public double countTotalSalary() {
		return getSalary();
	}
	
}
