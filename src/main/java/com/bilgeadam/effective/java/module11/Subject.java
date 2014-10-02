package com.bilgeadam.effective.java.module11;

/**
 * @link 
 *       http://www.javacodegeeks.com/2013/08/observer-design-pattern-in-java-example
 *       -tutorial.html
 */
public interface Subject {
	
	public void register(Observer observer);
	
	public void unregister(Observer observer);
	
	public void notifyObservers();
	
	public Object getUpdate(Observer observer);

}
