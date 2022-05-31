package ctrl;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@ViewScoped
public class KeypadController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7194726837826927902L;

	private static final String KEYPAD_TELEPHONE = "/keypad_telephone.xhtml";
	private static final String KEYPAD_CALCULATOR = "/keypad_calculator.xhtml";
	
	private String keypad = KEYPAD_CALCULATOR;
	
//	@Inject
//	FacesContext facesContext;
	
	public KeypadController() {
		System.out.println("Controller erstellt");
	}
	
	public void pressed(ActionEvent event) {
		UIComponent tmp = event.getComponent();
		
		if(tmp instanceof HtmlCommandButton) {
			HtmlCommandButton button = (HtmlCommandButton)tmp;
			
			System.out.println("gedrückt wurde: " + button.getValue() + " in " + button.getParent().getId());
		}
		
		
	}
	
	
	public void toggle() {
		System.out.println("Toggle");
		if(keypad.equals(KEYPAD_CALCULATOR)) {
			keypad = KEYPAD_TELEPHONE;
		} else {
			keypad = KEYPAD_CALCULATOR;
		}
	}

	public String getKeypad() {
		
		return keypad;
	}
	
	
}
