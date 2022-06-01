package ctrl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

@Named
@ApplicationScoped
public class DemoActionEvents implements Serializable {

	public void getParentAction(ActionEvent event) {
		/*
		 * Lesen der Elternkomponente
		 */
		UIComponent parentCMP = event.getComponent().getParent();

		/**
		 * Achtung NPE droht
		 */
//		System.out.println(parentCMP.getParent().getParent().getParent());

		System.out.println(parentCMP.getId());

		List<UIComponent> childs = parentCMP.getChildren();

		childs.forEach(System.out::println);

		for (UIComponent item : childs) {
			if (item instanceof HtmlOutputText) {
				HtmlOutputText hTxt = (HtmlOutputText) item;
				hTxt.setValue("Verändern der Komponenten per Java");
			}
			if (item instanceof HtmlCommandButton) {
				HtmlCommandButton hBtn = (HtmlCommandButton) item;
				hBtn.setDisabled(true);
			}
		}

	}
	
	public void readComponent(ActionEvent event) {
		
		System.out.println(event.isAppropriateListener(new MyFaceListener()));
		
		System.out.println(event.getPhaseId());
	}

}
