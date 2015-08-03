package employee;

import java.util.Scanner;

public abstract class Employee {

	private String name;
	private int age;
	private int id;
	private int experience;
	private double salary;
	
	protected static Scanner input = new Scanner(System.in);
	/**
	 * 
	 */
	public Employee() {
		
	}

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
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {	
		return name + " age is " + age + " ID=" 
		+ id + " experience is " + experience + " years";
	}
	
	public void printDetails() {
		System.out.println(this.toString());
	}
	
	public void addBasicDetails() {
		System.out.print("Name:");
		this.setName(input.next());
		System.out.print("Age:");
		this.setAge(input.nextInt());
		System.out.print("ID:");
		this.setId(input.nextInt());
		System.out.print("Experience:");
		this.setExperience(input.nextInt());
		System.out.print("Salary:");
		this.setSalary(input.nextDouble());
	}
	
	public abstract void addEmployee();
	
	public abstract void printSalary();
	
	public abstract double countTotalSalary();

}
