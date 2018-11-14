package com.licerlee.dp.behavior.observer;

public class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void onStatusUpdate() {
		System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
	}

	@Override
	public void onRegistObserver() {
		// TODO Auto-generated method stub
		
	}
}
