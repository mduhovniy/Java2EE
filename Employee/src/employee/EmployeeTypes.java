package employee;

public enum EmployeeTypes {
	MANAGER(1),
	SECRETARY(2),
	ENGINEER(3),
	CLEANER(4);
	
	private int typeNum;
	
	private EmployeeTypes(int typeNum) {
		this.typeNum = typeNum;
	}
	
	public int getTypeNum() {
		return typeNum;
	}
	
	
}
