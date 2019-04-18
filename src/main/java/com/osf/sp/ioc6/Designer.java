package com.osf.sp.ioc6;

import org.springframework.stereotype.Component;

@Component
public class Designer extends Worker {

	public Designer() {
		super("디자이너", "IT팀");
	}

	@Override
	public void doWork() {
		System.out.println("디자인 작업중!");
	}

	@Override
	public void goToOffice() {
		System.out.println("회사로 가자^_^");
	}

}
