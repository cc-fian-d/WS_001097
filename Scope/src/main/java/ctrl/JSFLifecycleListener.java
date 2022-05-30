package ctrl;

//import java.util.logging.Logger;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.faces.webapp.FacesServlet;

import org.jboss.logging.Logger;

public class JSFLifecycleListener implements PhaseListener{

	private static final Logger LOG = Logger.getLogger("JSF-LifeCycle");
	
	@Override
	public void afterPhase(PhaseEvent arg0) {
		LOG.info("-------- ENDE\n\n");
		FacesServlet test;
	}

	@Override
	public void beforePhase(PhaseEvent event) {
		LOG.info("-------- START");
		LOG.info(event.getPhaseId());
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}
