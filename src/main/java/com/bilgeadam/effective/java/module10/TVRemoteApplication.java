package com.bilgeadam.effective.java.module10;

public class TVRemoteApplication {

	public static void main(String[] args) {
		TVContext tvContext = new TVContext();
		State on = new TVStartState();
		State off = new TVStopState();
		tvContext.setCurrentState(on);
		tvContext.doAction();
		tvContext.setCurrentState(off);
		tvContext.doAction();
	}
}
