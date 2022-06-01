package ctrl;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.PhaseId;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;
import javax.inject.Inject;
import javax.inject.Named;

import model.DataBean;

@Named
@ApplicationScoped
public class MyValueChangeListener implements ValueChangeListener {

	@Inject
	DataBean dataBean;

	@Override
	public void processValueChange(ValueChangeEvent event) throws AbortProcessingException {
		event.setPhaseId(PhaseId.RENDER_RESPONSE);
		// System.out.println(event.getPhaseId());//1,2,X3,X4,5,6

		System.out.println(event.getOldValue());

		System.out.println(event.getNewValue());

		if (event.getNewValue().equals("Christian")) {
			//throw new AbortProcessingException("keine Christians erlaubt");
		}
	}

}
