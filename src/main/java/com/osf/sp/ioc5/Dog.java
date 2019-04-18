package com.osf.sp.ioc5;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("개가 사료를 먹습니다.");
	}

	@Override
	public void sleep() {
		System.out.println("개가 잠을 잡니다.");
	}

}
