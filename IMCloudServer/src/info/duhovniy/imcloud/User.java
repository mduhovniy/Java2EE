package info.duhovniy.imcloud;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	
	private Integer id = null;
	private String nick;
	private String email;
	private String pass;
	private String registration_id;
	private String canonical_id = null;
	
	public User() {
	}

	/**
	 * @param nick
	 * @param email
	 * @param pass
	 * @param registration_id
	 */
	public User(String nick, String email, String pass, String registration_id) {
		this.nick = nick;
		this.email = email;
		this.pass = pass;
		this.registration_id = registration_id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getRegistration_id() {
		return registration_id;
	}

	public void setRegistration_id(String registration_id) {
		this.registration_id = registration_id;
	}

	public String getCanonical_id() {
		return canonical_id;
	}

	public void setCanonical_id(String canonical_id) {
		this.canonical_id = canonical_id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", nick=" + nick + ", registration_id=" + registration_id + ", canonical_id="
				+ canonical_id + "]";
	}

}
