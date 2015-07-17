
public class Project {

	protected String mNameProject;
	protected int mNumberProject;
	protected int mHoursProject;
	
	/**
	 * Constructor of new Project with 3 parameters
	 * @param mNameProject
	 * @param mNumberProject
	 * @param mHoursProject
	 */
	public Project(String nameProject, int numberProject, int hoursProject) {
		mNameProject = nameProject;
		mNumberProject = numberProject;
		mHoursProject = hoursProject;
	}
	
	/**
	 * @return the mHoursProject
	 */
	public int getHoursProject() {
		return mHoursProject;
	}
	
	/**
	 * @param mHoursProject the hoursProject to set
	 */
	public void setHoursProject(int hoursProject) {
		this.mHoursProject = hoursProject;
	}
	
	/**
	 * @return the mNameProject
	 */
	public String getNameProject() {
		return mNameProject;
	}
	
	/**
	 * @return the mNumberProject
	 */
	public int getNumberProject() {
		return mNumberProject;
	}
	
}
