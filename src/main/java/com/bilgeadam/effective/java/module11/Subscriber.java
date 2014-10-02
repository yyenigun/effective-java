package com.bilgeadam.effective.java.module11;

public class Subscriber implements Observer {

	private String name;
	private Subject topic;
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update() {
		String msg = (String) topic.getUpdate(this);
		if (msg == null) {
			System.out.println(name + ":: No new message");
		} else {
			System.out.println(name + ":: Consuming message::" + msg);
		}

	}

	@Override
	public void setSubject(Subject subject) {
		this.topic=subject;
	}

}
