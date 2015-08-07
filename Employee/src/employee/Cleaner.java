package employee;

public class Cleaner extends Employee {

	private int nightCounter;
	private double perNight;
	

	/**
	 * @param name
	 * @param age
	 * @param id
	 * @param experience
	 * @param salary
	 * @param nightCounter
	 * @param perNight
	 */
	public Cleaner(String name, int age, int id, int experience, double salary,
			int nightCounter, double perNight) {
		super(name, age, id, experience, salary);
		this.nightCounter = nightCounter;
		this.perNight = perNight;
	}

	/**
	 * 
	 */
	public Cleaner() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the nightCounter
	 */
	public int getNightCounter() {
		return nightCounter;
	}

	/**
	 * @param nightCounter the nightCounter to set
	 */
	public void setNightCounter(int nightCounter) {
		this.nightCounter = nightCounter;
	}

	/**
	 * @return the perNight
	 */
	public double getPerNight() {
		return perNight;
	}

	/**
	 * @param perNight the perNight to set
	 */
	public void setPerNight(double perNight) {
		this.perNight = perNight;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cleaner name is " + super.toString() + "\nnumber of nights " + nightCounter 
				+ " and wage per night " + perNight;
	}

	@Override
	public void addEmployee() {
		System.out.println("Creation of new Cleaner. Please enter details");
		System.out.println("---------------------------------------------");
		this.addBasicDetails();
		System.out.print("Number of nights:");
		this.setNightCounter(input.nextInt());
		System.out.print("Wage per night:");
		this.setPerNight(input.nextDouble());	
	}

	@Override
	public void printSalary() {
		System.out.println("Cleaner " + getName() + " salary is " + countTotalSalary()
				+ " in $" + (countTotalSalary() * getDollarRate()));
	}

	@Override
	public double countTotalSalary() {
		return getSalary() + (nightCounter * perNight);
	}

}
