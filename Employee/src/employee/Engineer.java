package employee;

public class Engineer extends Employee {

	private double bonus;
	
	/**
	 * 
	 */
	public Engineer() {
		super();
	}

	public Engineer(String name, int age, int id, int experience,
			double salary, double bonus) {
		super(name, age, id, experience, salary);
		this.bonus = bonus;
		
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Engineer name is " + super.toString() + "\nand bonus is " + bonus;
	}

	@Override
	public void addEmployee() {
		this.addBasicDetails();
		System.out.print("Bonus:");
		this.setBonus(Input.getNewDouble());
	}

	@Override
	public void printSalary() {
		System.out.println("Engineer " + getName() + " salary is " + countTotalSalary() 
				+ " in $" + (float)(countTotalSalary() / getDollarRate()));
	}

	@Override
	public double countTotalSalary() {
		return getSalary() + bonus;
	}
	
}
