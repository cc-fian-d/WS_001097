package ctrl;

import java.util.EventObject;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.faces.event.ValueChangeEvent;

public class JSFLifecycle implements PhaseListener {

	@Override
	public void afterPhase(PhaseEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforePhase(PhaseEvent event) {
//		System.out.println("LifeCycle");
//		if((EventObject)event instanceof ValueChangeEvent) {
//			System.out.println("Lifecycle : " + event.getClass());
//		}
		
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}
