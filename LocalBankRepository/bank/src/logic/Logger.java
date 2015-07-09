/**
 * 
 */
package logic;

/**
 * @author maxduhovniy
 *
 */
public class Logger {

	private String mDriverName;
	public final static String DEFAULT_DRIVER_NAME = "Default";


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
		
		Log[] logBase = new Log[0];
		return logBase;
		
	}
	
}
