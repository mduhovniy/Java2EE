package info.duhovniy.imcloud;

public class NetConstant {

	// GCM API Key
	static final String API_KEY = "AIzaSyBC2yF5WfYu124WIaju4QspGdkZ2LP5dZk";
	
	// GCM gate URL
	static final String GATE_URL = "https://gcm-http.googleapis.com/gcm/send";
	
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_TYPE = "jdbc:mysql://";
	static final String DB_HOST = "localhost/";
	static final String DB_NAME = "IMCloud";
	static final String DB_URL = DB_TYPE + DB_HOST + DB_NAME;

	// Table names
	static final String USER_TABLE = "users";
	static final String LOG_TABLE = "conversation_log";

	// Database credentials
	static final String USER = "root";
	static final String PASSWORD = "lgh35#lake";

	// Database fields
	static final String ID = "id";
	
	static final String NICK = "nick";
	static final String EMAIL = "email";
	static final String PASS = "pass";
	static final String REG_ID = "registration_id";
	static final String CAN_ID = "canonical_id";
	
	static final String TIME = "time";
	static final String FROM = "from";
	static final String TO = "to";
	static final String MSG = "message";

}
