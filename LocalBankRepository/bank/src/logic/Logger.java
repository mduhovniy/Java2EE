/**
 * 
 */
package logic;

/**
 * @author maxduhovniy
 *
 */
public class Logger {

	public final static String DEFAULT_DRIVER_NAME = "Default driver";
	private String mDriverName = DEFAULT_DRIVER_NAME;
	
	public final static String CHANGE_BALANSE = "balance was changed";
	public final static String ADD_NEW_ACCOUNT = "new account added";	
	public final static String ADD_NEW_CLIENT = "new client added";	
	public final static String DEL_ACCOUNT = "existing account removed";
	public final static String DEL_CLIENT = "existing client removed";
	public final static String UPDATE_ACCOUNTS = "all accounts updated";

	/**
	 * Logger class constructor
	 * @param driverName Sets driver name for new logs
	 */
	public Logger(String driverName) {
		
		this.mDriverName = driverName;
	}
	
	/**
	 * Logger class output. Prints log string on the screen
	 * @param log object to print
	 */
	public void log(Log log) {
		
		System.out.println(log.getData());
		
	}
	
	/**
	 * Getter for Logger class
	 * @return array of objects from class Log
	 */
	public Log[] getLogs() {
		
		Log[] logBase = new Log[0];	// TODO: logBase
		return logBase;
		
	}
	
}
