package employee;

public class Secretary extends Employee{
	
	private int hours;
	private double perHour;
	
	public Secretary(String name, int age, int id, int experience,
			double salary, int hours, double perHour) {
		super(name, age, id, experience, salary);
		this.hours = hours;
		this.perHour = perHour;
		this.countSalary();
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
	
	private void countSalary() {
		
		this.setSalary(super.getSalary() + (hours * perHour));
		
	}

	@Override
	public String toString() {
		return "Secretary name is " + super.toString() + "\nhours of work " + hours 
				+ " and wage per hour " + perHour;
	}

}
