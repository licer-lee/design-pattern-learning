package com.licerlee.dp.behavior.observer;

public abstract class Observer {
	protected Subject subject;

	public abstract void onStatusUpdate();
	
	public abstract void onRegistObserver();
}
