package com.licerlee.dp.build.factorymethod;

public class SmsSenderFactory implements Provider {

	public Sender provide() {
		return new SmsSender();
	}

}
