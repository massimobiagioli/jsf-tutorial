package it.massimobiagioli.tutorial.jsf.listeners;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class CustomPhaseListener implements PhaseListener {

	private static final long serialVersionUID = 1L;

	public void afterPhase(PhaseEvent event) {
		System.out.println("After - " + event.getPhaseId().toString()); 
	}

	public void beforePhase(PhaseEvent event) {
		System.out.println("Before - " + event.getPhaseId().toString()); 
	}

	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}
