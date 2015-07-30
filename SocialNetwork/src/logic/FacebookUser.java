package logic;

public class FacebookUser extends SocialNetworkUser {

	private int numberOfLikes;

	/**
	 * @param userName
	 * @param userPassword
	 */
	public FacebookUser(String userName, String userPassword) {
		super(userName, userPassword);
		numberOfLikes = 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Facebook " + super.toString() + "\nNumber of likes="
				+ numberOfLikes;
	}

	public void newLike() {
		numberOfLikes++;
	}

	/**
	 * @return the numberOfLikes
	 */
	public int getNumberOfLikes() {
		return numberOfLikes;
	}

}
