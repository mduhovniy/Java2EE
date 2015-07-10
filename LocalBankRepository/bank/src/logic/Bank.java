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
	private Client[] mClients;
	private Logger mLogService;
	private Logger mLogger;
	private float mBalance = 0;
	private boolean mAccountUpdater = false;
	
	/**
	 * new Bank object constructor
	 */
	public Bank() {
		
		mClients = new Client[MAX_NUM_OF_CLIENTS];;
		mLogService = new Logger(Logger.DEFAULT_DRIVER_NAME);
		
	}
	
	public void setBalance() {
		
		for (int i = 0; i < MAX_NUM_OF_CLIENTS; i++) {	
			if (mClients[i] != null) {
				mBalance += mClients[i].getFortune();
			}
		}
	}
	
	public float getBalance() {
		return mBalance;
	}
	
	public void addClient(Client newClient) {
		Log log;
		
		for (int i=0; i < MAX_NUM_OF_CLIENTS; i++) {
			if (mClients[i] == null) {
				mClients[i] = newClient;
				log = new Log(System.currentTimeMillis(), newClient.getID(), 
						Logger.ADD_NEW_CLIENT, newClient.getBalance());
				mLogger.log(log);
				break;
			} else if (i == (MAX_NUM_OF_CLIENTS - 1)) {
				// TODO: exception!!! Clients array overflow
			}
		}
	}
	
	public void removeClient(int id) {
		Log log;
		
		for (int i = 0; i < MAX_NUM_OF_CLIENTS; i++) {
			if (mClients[i].getID() == id) {
				log = new Log(System.currentTimeMillis(), id, Logger.DEL_CLIENT, 
						mClients[i].getBalance());  // TODO: something with balance?
				mLogger.log(log);
			}
		}
	}
	
	Client[] getClients() {
		return mClients;
	}
		
	public void startAccountUpdater() {
		mAccountUpdater = true;	// TODO: account update procedure
	}
	
}
