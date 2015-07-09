/**
 * 
 */
package logic;

/**
 * @author maxduhovniy
 *
 */
public class Account {
	
	private int mID;
	private float mBalance;
	public final static String CHANGE_BALANSE = "change balance";
	
	/**
	 * Constructor for Account class
	 * @param id Client ID of new account
	 * @param balance of new account
	 */
	public Account(int id, float balance) {
		
		this.mID = id;
		this.mBalance = balance;
		
	}

	public float getBalance() {
		return mBalance;
	}

	public void setBalance(float balance) {
		
		Log log;
		
		this.mBalance = balance;
		log = new Log(System.currentTimeMillis(), mID, CHANGE_BALANSE, balance);
		
	}

	public int getID() {
		return mID;
	}	

}
