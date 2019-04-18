package com.osf.sp.ioc5;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println("고양이가 사료를 먹습니다.");
	}

	@Override
	public void sleep() {
		System.out.println("고양이가 잠을 잡니다.");
	}

}
