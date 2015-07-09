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
	private Logger mLogger;

	
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
		log = new Log(System.currentTimeMillis(), mID, Logger.CHANGE_BALANSE, balance);
		this.mLogger.log(log);
		
	}

	public int getID() {
		return mID;
	}	

}
