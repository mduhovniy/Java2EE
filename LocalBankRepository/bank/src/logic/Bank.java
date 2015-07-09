/**
 * 
 */
package logic;

/**
 * @author maxduhovniy
 *
 */
public class Bank {
	
	public final static int MAX_NUM_OF_CLIENTS = 100;
	private Client[] mClients = new Client[MAX_NUM_OF_CLIENTS];
	private Logger mLogService;
	private Logger mLogger;
	private float mBalance = 0;
	private boolean mAccountUpdater = false;
	
	/**
	 * 
	 * @param mClients
	 * @param mLogService
	 */
	public Bank(Client[] mClients, Logger mLogService) {
		
		this.mClients = mClients;
		this.mLogService = mLogService;
		
	}
	
	public void setBalance() {
		for (int i = 0; i < MAX_NUM_OF_CLIENTS; i++) {
			
			if (mClients[i] != null) {
				this.mBalance += mClients[i].getFortune();
			}
		}
	}
	
	public float getBalance() {
		return this.mBalance;
	}
	
	
	
	
	
	
	
	
	public void startAccountUpdater() {
		this.mAccountUpdater = true;
	}
	
}
