package com.licerlee.dp;

import java.util.concurrent.TimeUnit;

// 回调模式？
public class Test {

	public static void main(String[] args) {
		Sender s = new MailSender();
		s.send();
	}
}

class MailSender extends SendService {

	public void onSendOk() {
		System.out.println("Send ok");
	}

	public void onSendFail() {
		System.out.println("timeout, Send fail");
	}

}

abstract class SendService implements Sender {

	// final 修饰提供基础能力，不允许被重写
	public final void send() {
		System.out.println("send start...");
		int timeout = (int) (Math.random() * 10);
		try {
			TimeUnit.SECONDS.sleep(timeout);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (timeout > 5)
			onSendFail();
		else
			onSendOk();
	}
}

interface Sender {

	void send();

	void onSendOk();

	void onSendFail();
}