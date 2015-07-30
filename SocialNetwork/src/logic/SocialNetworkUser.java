package logic;

public class SocialNetworkUser {

	private String userName;
	private String userPassword;

	
	/**
	 * @param userName
	 * @param userPassword
	 */
	public SocialNetworkUser(String userName, String userPassword) {
		this.userName = userName;
		this.userPassword = userPassword;
	}

	public void printUserDetails() {
		System.out.println(this.toString());
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "network user called " + userName + " with password=" + userPassword;
	}
	/**
	 * @return the userPassword
	 */
	public String getUserPassword() {
		return userPassword;
	}
	/**
	 * @param userPassword the userPassword to set
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	
	
}
