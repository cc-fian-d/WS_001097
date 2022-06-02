package model;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@UserValid
@SessionScoped
@Named
public class User implements Serializable{

//	@NotNull
	private String lastname;// null

//	@NotNull
	private String firstname;// null

//	@NotNull
	private Integer age;// null

	public User() {
		
	}
	
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
