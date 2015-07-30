package logic;

public class GooglePlusUser extends SocialNetworkUser {

	private String gMailAccount;

	/**
	 * @param userName
	 * @param userPassword
	 */
	public GooglePlusUser(String userName, String userPassword) {
		super(userName, userPassword);
	}

	/**
	 * @param userName
	 * @param userPassword
	 * @param gMailAccount
	 */
	public GooglePlusUser(String userName, String userPassword,
			String gMailAccount) {
		super(userName, userPassword);
		this.gMailAccount = gMailAccount;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Google Plus " + super.toString() + "\nGmail account="
				+ gMailAccount;
	}

	/**
	 * @return the gMailAccount
	 */
	public String getgMailAccount() {
		return gMailAccount;
	}

	/**
	 * @param gMailAccount
	 *            the gMailAccount to set
	 */
	public void setgMailAccount(String gMailAccount) {
		this.gMailAccount = gMailAccount;
	}

}
