package ctrl.scope;

import java.io.Serializable;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named("cdiConversationScope")
@ConversationScoped
public class CDIConversationScopeExmpleBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3982990919608920033L;

	@Inject
	private Conversation conversation;

	private String nachricht;

	private String[] nachrichten = { "Hi There!!", "Habt einen schönen Tag!", "Bis bald..", "Ola Amigos!",
			"Juten Tach och!", "Sayonara..", "Sehr nur es ist ein 3 Köpfiger Affe" };

	public Conversation getConversation() {
		return conversation;
	}

	public String getNachricht() {
		return nachricht;
	}

	public void setNachricht(String nachricht) {
		this.nachricht = nachricht;
	}
	
	@PostConstruct
	public void initialize() {
		nachricht = "42. Ganz klar. Und etwas Fisch.";
	}
	
	public void initConversation() {
		if(!FacesContext.getCurrentInstance().isPostback() && conversation.isTransient()) {
			conversation.begin();
			conversation.setTimeout(500);
		}
	}
	
	public void wechsleNachricht() {
		nachricht = nachrichten[new Random().nextInt(7)];
	}
	
	public String next() {
		return "secondpage?faces-redirect=true";
	}
	
	public String endConversation() {
		if(!conversation.isTransient()) {
			conversation.end();
		}
		return "firstpage?faces-redirect=true";
	}

}
