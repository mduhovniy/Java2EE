package employee;

public class Secretary extends Employee{
	
	private int hours;
	private double perHour;

	/**
	 * 
	 */
	public Secretary() {
		super();
	}

	public Secretary(String name, int age, int id, int experience,
			double salary, int hours, double perHour) {
		super(name, age, id, experience, salary);
		this.hours = hours;
		this.perHour = perHour;
	}
	
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public double getPerHour() {
		return perHour;
	}
	public void setPerHour(double perHour) {
		this.perHour = perHour;
	}

	@Override
	public String toString() {
		return "Secretary name is " + super.toString() + "\nhours of work " + hours 
				+ " and wage per hour " + perHour;
	}

	@Override
	public void addEmployee() {
		this.addBasicDetails();
		System.out.print("Working hours:");
		this.setHours(Input.getNewInt());
		System.out.print("Wage per hour:");
		this.setPerHour(Input.getNewDouble());	
	}

	@Override
	public void printSalary() {
		System.out.println("Secretary " + getName() + " salary is " + countTotalSalary()
				+ " in $" + (float)(countTotalSalary() / getDollarRate()));
	}

	@Override
	public double countTotalSalary() {
		return getSalary() + (hours * perHour);
	}

}
