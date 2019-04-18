package com.osf.sp.ioc4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class School {

	private Person p;
	
	@Autowired
	public School(Person p) {
		this.p = p;
	}
}
