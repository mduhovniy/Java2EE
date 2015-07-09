package logic;

/**
 * @author maxduhovniy
 *
 */
public class Log {
	
	private long mTimeStamp;
	private int mClientId;
	private String mDescription;
	private float mAmount;
	
	/**
	 * Log constructor. Create a log of 1 transaction
	 * @param timestamp time of creation
	 * @param clientId client identifier
	 * @param description type of operation
	 * @param amount amount of transaction
	 */
	public Log(long timestamp, int clientId, String description, float amount) {
	
		this.mTimeStamp = timestamp;
		this.mClientId = clientId;
		this.mDescription = description;
		this.mAmount = amount;
	
	}

	/**
	 * Get method for all log
	 * @return Returns string of log in readable format
	 */
	public String getData() {
		String logString = "In timestamp " + mTimeStamp + " client #" + mClientId +
				"\n does operation " + mDescription + " with " + mAmount + " NIS";
		return logString;
	}
	
}
