package logic;

public class InstagramUser extends SocialNetworkUser {

	private String photoAlbumName;

	/**
	 * @param userName
	 * @param userPassword
	 */
	public InstagramUser(String userName, String userPassword) {
		super(userName, userPassword);
	}

	/**
	 * @param userName
	 * @param userPassword
	 * @param photoAlbumName
	 */
	public InstagramUser(String userName, String userPassword,
			String photoAlbumName) {
		super(userName, userPassword);
		this.photoAlbumName = photoAlbumName;
	}

	/**
	 * @return the photoAlbumName
	 */
	public String getPhotoAlbumName() {
		return photoAlbumName;
	}

	/**
	 * @param photoAlbumName
	 *            the photoAlbumName to set
	 */
	public void setPhotoAlbumName(String photoAlbumName) {
		this.photoAlbumName = photoAlbumName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Instagram " + super.toString() + "\nName of photo album="
				+ photoAlbumName;
	}

}
