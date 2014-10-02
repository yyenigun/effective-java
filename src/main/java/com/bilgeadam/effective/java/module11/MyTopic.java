package com.bilgeadam.effective.java.module11;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {
	
	private List<Observer> observers;
	private String message;
	private boolean changed;
    private final Object MUTEX= new Object();

    public MyTopic(){
    	observers = new ArrayList<Observer>();
    }
    
	@Override
	public void register(Observer observer) {
		if(observer == null){
			throw new NullPointerException("Null observer!");
		}
		if(!observers.contains(observer)){
			observers.add(observer);
		}
	}

	@Override
	public void unregister(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		List<Observer> observersLocal = null;
		//synchronization is used to make sure any observer registered after message is received is not notified
		synchronized (MUTEX) {
			if (!changed)
				return;
			observersLocal = new ArrayList<>(this.observers);
			this.changed=false;
		}
		for (Observer obj : observersLocal) {
			obj.update();
		}
	}

	@Override
	public Object getUpdate(Observer observer) {
		return this.message;
	}
	
	//method to post message to the topic
	public void postMessage(String msg){
		System.out.println("Message Posted to Topic: "+msg);
		this.message=msg;
		this.changed=true;
		notifyObservers();
	}

}
