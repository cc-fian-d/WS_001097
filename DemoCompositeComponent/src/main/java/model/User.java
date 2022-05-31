package model;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

@Named
@SessionScoped
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6540846076666686493L;
	private String firstname;
	private String lastname;
	private String email;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("Email wurde geschrieben");
		this.email = email;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public void pressed(ActionEvent event) {
		UIComponent tmp = event.getComponent();

		if (tmp instanceof HtmlCommandButton) {
			HtmlCommandButton button = (HtmlCommandButton) tmp;

			System.out.println("gedrückt wurde: " + button.getValue() + " in " + button.getParent().getId());
		}

	}
	
	public String login() {
		return "success";
	}

}
