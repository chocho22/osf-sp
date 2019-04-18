package com.osf.sp.ioc6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc6/ioc.xml");
		Company comp = (Company) ac.getBean("company");
		comp.startOperate();
		comp.operating();
	}
}
