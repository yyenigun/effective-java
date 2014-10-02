package com.bilgeadam.effective.java.module11;

public class ObserverPatternTest {

	public static void main(String[] args) {
		MyTopic topic = new MyTopic();
		
		Observer observer = new Subscriber("Obj1");
		Observer observer2 = new Subscriber("Obj2");
		Observer observer3 = new Subscriber("Obj3");
		
		topic.register(observer);
		topic.register(observer2);
		topic.register(observer3);
		
		observer.setSubject(topic);
		observer2.setSubject(topic);
		observer3.setSubject(topic);
		
		observer.update();
		
		topic.postMessage("New Message!");

	}

}
