package com.licerlee.dp.behavior.observer;

public class HexaObserver extends Observer {

	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void onStatusUpdate() {
		System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
	}

	@Override
	public void onRegistObserver() {
		// TODO Auto-generated method stub
		
	}

}
