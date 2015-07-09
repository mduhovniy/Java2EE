/**
 * 
 */
package logic;

/**
 * @author maxduhovniy
 *
 */
public class Client {
	
	public final static int MAX_NUM_OF_ACCOUNTS = 5;
	public final static String ADD_NEW_ACCOUNT = "addition of new account";	
	public final static String DEL_ACCOUNT = "removing of account";
	public final static String UPDATE_ACCOUNTS = "update of accounts";
	private int mID;
	private String mName;
	private float mBalance;
	private Account[] mAccounts = new Account[MAX_NUM_OF_ACCOUNTS];
	private float mCommissionRate = 0;
	private float mInterestRate = 0;
	private Logger mLogger;
	
	/**
	 * Constructor for new Client
	 * @param mID new Client ID
	 * @param mName name of new Client
	 * @param mBalance starting balance
	 */
	public Client(int id, String name, float balance) {
		
		this.mID = id;
		this.mName = name;
		this.mBalance = balance;
		this.mLogger = new Logger(Logger.DEFAULT_DRIVER_NAME);
		
	}

	public String getName() {
		return mName;
	}

	public void setName(String name) {
		this.mName = name;
	}

	public float getBalance() {
		return this.mBalance;
	}

	public void setBalance(float balance) {
		this.mBalance = balance;
	}

	public int getID() {
		return mID;
	}

	public Account[] getAccounts() {
		return mAccounts;
	}
	
	public void addAccount(Account newAccount) {
		
		Log log;
		
		for (int i=0; i < MAX_NUM_OF_ACCOUNTS; i++) {
			if (this.mAccounts[i] == null) {
				this.mAccounts[i] = newAccount;
				log = new Log(System.currentTimeMillis(), mID, ADD_NEW_ACCOUNT, 0);
				mLogger.log(log);
				break;
			} else if (i == (MAX_NUM_OF_ACCOUNTS - 1)) {
				// exception!!! Accounts array overflow
			}
		}
		
	}
	
	public Account getAccount(int index) {
		
		if(0 <= index && index < MAX_NUM_OF_ACCOUNTS) {
			return this.mAccounts[index];
		} else {
			return null;
		}
		
	}
	
	public void removeAccount(int id) {
		
		Log log;
		
		for(int i = 0; i < MAX_NUM_OF_ACCOUNTS; i++) {
			
			if (mAccounts[i].getID() == id) {
				
				this.mBalance += mAccounts[i].getBalance();
				log = new Log(System.currentTimeMillis(), mAccounts[i].getID(), DEL_ACCOUNT, 
						mAccounts[i].getBalance());
				mLogger.log(log);
				mAccounts[i] = null;
			}
		}
	}
	
	public void deposit(float amount) {
		
		this.mBalance += amount;
		
	}
	
	public void withdraw(float amount) {
		
		this.mBalance -= (amount + amount * this.mCommissionRate);
		
	}
	
	public void autoUpdateAccounts() {
		
		Log log;
		
		for (int i = 0; i < MAX_NUM_OF_ACCOUNTS; i++) {
			
			if(this.mAccounts[i] != null) {
				this.mAccounts[i].setBalance(this.mAccounts[i].getBalance() * 
						(1 + this.mInterestRate / 100));
			}

		}
		
		log = new Log(System.currentTimeMillis(), mID, UPDATE_ACCOUNTS, 0);
		mLogger.log(log);
		
	}

}
