package com.osf.sp.ioc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc1/ioc.xml");
		Student s = (Student)ac.getBean("s");
		Person p1 = s.getP();
		Person p2 = (Person) ac.getBean("p");
		System.out.println(p1==p2);
	}
}
