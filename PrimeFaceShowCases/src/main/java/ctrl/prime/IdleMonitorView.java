package ctrl.prime;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class IdleMonitorView {

	public void onIdle() {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_ERROR, "Keine Aktivit�t erkannt", "Benutzer eingeschlafen"));

	}

	public void onWakeup() {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_WARN, "Aktivit�t entdeckt", "Benutzer aufgewacht"));
	}

}
