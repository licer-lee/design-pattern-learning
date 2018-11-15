package com.licerlee.dp.struct.proxy;

public class ProxyImage implements Image {

	private String imageName;
	// 持有被代理对象
	private RealImage realImage;
	
	public ProxyImage(String name ) {
		this.imageName = name;
	}
	
	@Override
	public void display() {
		if(realImage == null)
			realImage = new RealImage(imageName);
		realImage.display();
	}

}
