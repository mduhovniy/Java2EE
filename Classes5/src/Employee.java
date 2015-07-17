
public class Employee {

	private String mName;
	private int mNumberOfEmployee;
	private double mWage;	// wage per 1 hour in NIS
	private static final double MIN_WAGE = 26;
	public Project newProject;


	/**
	 * Constructor of new Employee with 3 local parameters
	 * @param mName
	 * @param mNumberOfEmployee
	 * @param mWage
	 */
	public Employee(String name, int numberOfEmployee, double wage) {
		mName = name;
		mNumberOfEmployee = numberOfEmployee;
		mWage = wage;
	}

	/**
	 * Constructor of new Employee with 2 parameters
	 * @param mName
	 * @param mNumberOfEmployee
	 */
	public Employee(String name, int numberOfEmployee) {
		mName = name;
		mNumberOfEmployee = numberOfEmployee;
		mWage  = MIN_WAGE;
	}

	/**
	 * @return the mSalary
	 */
	public double getWage() {
		return mWage;
	}

	/**
	 * @param salary the mSalary to set
	 */
	public void setWage(double wage) {
		this.mWage = wage;
	}

	/**
	 * @return the mName
	 */
	public String getName() {
		return mName;
	}

	/**
	 * @return the mNumberOfEmployee
	 */
	public int getNumberOfEmployee() {
		return mNumberOfEmployee;
	}
	
	/** 
	 * Returns salary per project by hours and wage per hour
	 * @param hours
	 * @return
	 */
	public double getSalary(int hours) {
		return (hours * mWage);
	}
	
}