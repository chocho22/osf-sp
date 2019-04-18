package com.osf.sp.ioc5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PetCafe {
	
	@Autowired
	@Qualifier("cat")
	private Animal animal;
	
	@Autowired
	public PetCafe(@Qualifier("cat")Animal animal) {
		this.animal = animal;
	}
	
	public void feed() {
		animal.eat();
	}
}
