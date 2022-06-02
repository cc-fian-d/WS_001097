package model;

import java.io.Serializable;
import java.util.Objects;
import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;
import javax.inject.Named;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Named
//@RequestScoped
@SessionScoped
@UserValid
public class User implements Serializable,ValueChangeListener {

	private static final Logger logger = Logger.getLogger("Benutzer");

//	@Size(min = 3, max = 7)
	private String name;

//	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,32}$")
	private String password;

	private String email;
	
	private Section section;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, String password, String email, Section section) {
		this.setName(name);
		this.setPassword(password);
		this.setEmail(email);
		this.setSection(section);
	}



	@Override
	public int hashCode() {
		return Objects.hash(name, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(name, other.name) && Objects.equals(password, other.password);
	}

	/*
	 * Wegen CDI und dem Proxy Objekt
	 */
	public User copy() {
		return new User(this.getName(), this.getPassword(), this.getEmail(), this.getSection());
	}

	@Override
	public void processValueChange(ValueChangeEvent event) throws AbortProcessingException {
		System.out.println(event.getNewValue());
		
	}

}
