package com.osf.sp.ioc5;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {
	Map<String,Animal> map = new HashMap<String,Animal>(); 
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc5/ioc.xml");
		PetCafe pc = (PetCafe) ac.getBean("petCafe");
		pc.feed();
	}
}
