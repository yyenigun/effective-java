package com.bilgeadam.effective.java.module10;

public class TVContext implements State {

	private State currentState;

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	@Override
	public void doAction() {
		this.currentState.doAction();
	}

}
