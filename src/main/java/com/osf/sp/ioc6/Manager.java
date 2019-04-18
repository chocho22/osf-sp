package com.osf.sp.ioc6;

import org.springframework.stereotype.Component;

@Component
public class Manager extends Worker {

	public Manager() {
		super("매니저", "IT팀");
	}

	@Override
	public void doWork() {
		System.out.println("주식이,,,,어떻게됐더라,,,,");
	}

	@Override
	public void goToOffice() {
		System.out.println("아침이라,,,힘들다,,오후에가야지,,,,,");
	}

}
