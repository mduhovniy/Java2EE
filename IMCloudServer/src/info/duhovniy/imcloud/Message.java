package info.duhovniy.imcloud;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	String to;
	String message;
	
	public Message() {
	}
	
	/**
	 * @param to
	 * @param message
	 */
	public Message(String to, String message) {
		super();
		this.to = to;
		this.message = message;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Message [to=" + to + ", message=" + message + "]";
	}
	
	public boolean hasRecipient() {
		boolean has = true;
		
		if (getTo().equals("") || getTo() == null) {
			has = false;
		}
		
		return has;
	}
	
}
