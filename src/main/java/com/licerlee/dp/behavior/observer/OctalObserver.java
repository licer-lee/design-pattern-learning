package com.licerlee.dp.behavior.observer;

public class OctalObserver extends Observer {

	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void onStatusUpdate() {
		System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
	}

	@Override
	public void onRegistObserver() {
		
	}

}
