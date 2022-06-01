package model;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@Named
@RequestScoped
public class User implements Serializable{

	@NotNull
	@NotBlank
	private String name;
	
	@PositiveOrZero
	private int alter;
	
	@Email
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public User copy() {
		User tmp = new User();
		tmp.setAlter(this.getAlter());
		tmp.setEmail(this.getEmail());
		tmp.setName(this.getName());
		return tmp;
	}
	
}
