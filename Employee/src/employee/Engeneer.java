package employee;

public class Engeneer extends Employee {

	private double bonus;

	public Engeneer(String name, int age, int id, int experience,
			double salary, double bonus) {
		super(name, age, id, experience, salary);
		this.bonus = bonus;
		this.countSalary();
		
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Engneer name is " + super.toString() + "\nand bonus is " + bonus;
	}
	
	private void countSalary() {
		
		this.setSalary(super.getSalary() + bonus);
		
	}
	
}
