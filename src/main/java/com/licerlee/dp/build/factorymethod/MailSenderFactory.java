package com.licerlee.dp.build.factorymethod;

public class MailSenderFactory implements Provider {

	public Sender provide() {
		return new MailSender();
	}

}
