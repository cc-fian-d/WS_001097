package model;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.event.ComponentSystemEvent;
import javax.inject.Named;

@SessionScoped
@Named
public class DataBean implements Serializable {

	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void handleEvent(ComponentSystemEvent event) {
		
		text = event.toString();
	}
	
}
