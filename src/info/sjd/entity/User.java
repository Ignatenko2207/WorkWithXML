package info.sjd.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "user")
public class User {

	private String login;
	private String pass;
	private String firstName;
	private String lastName;

	public String getLogin() {
		return login;
	}
	
	@XmlElement
	public void setLogin(String login) {
		this.login = login;
	}

	public String getPass() {
		return pass;
	}

	@XmlElement
	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getFirstName() {
		return firstName;
	}

	@XmlElement
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@XmlElement
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
