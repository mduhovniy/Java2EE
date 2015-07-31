package employee;

public class Manager extends Employee {

	private int vacation;

	public Manager(String name, int age, int id, int experience, double salary,
			int vacation) {
		super(name, age, id, experience, salary);
		this.vacation = vacation;
	}

	public double getVacation() {
		return vacation;
	}

	public void setVacation(int vacation) {
		this.vacation = vacation;
	}

	@Override
	public String toString() {
		return "Manager name is " + super.toString() + "\nand vacation " + vacation + " days";
	}
	
}
