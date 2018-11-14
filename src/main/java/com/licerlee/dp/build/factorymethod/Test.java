package com.licerlee.dp.build.factorymethod;

public class Test {

	public static void main(String[] args) {
		
		Sender s = new MailSenderFactory().provide();
		Sender ss = new SmsSenderFactory().provide();
		s.send();
		ss.send();
	}
}
