package com.licerlee.dp.struct.proxy;

public class RealImage implements Image {

	private String imageName;
	
	public RealImage(String name) {
		this.imageName = name;
		loadFromDisk(name);
	}
	
	@Override
	public void display() {
		System.out.println("display image:"+ imageName);
	}

	private void loadFromDisk(String name){
		System.out.println("image loaded "+ name);
	}
}
