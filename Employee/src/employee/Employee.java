package employee;

public class Employee {

	private String name;
	private int age;
	private int id;
	private int experience;
	private double salary;
	
	public Employee(String name, int age, int id, int experience, double salary) {
		
		this.name = name;
		this.age = age;
		this.id = id;
		this.experience = experience;
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {	
		return name + " age is " + age + " ID " 
		+ id + " experience " + experience;
	}
	
	public void printDetails() {
		System.out.println(toString());
	}
	
	public void printSalary() {	
		System.out.println("Employee " + name + " salary is " + salary);
	}

}
