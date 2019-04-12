package com.osf.sp.ioc2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc2/ioc.xml");
		CarMaker h = (CarMaker) ac.getBean("h");
		h.sellCar();
		CarMaker k = (CarMaker) ac.getBean("k");
		k.sellCar();
	}
}
