package com.osf.sp.ioc6;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Company {

	private List<Worker> workers;
	
	@Autowired
	public Company(List<Worker> workers) {
		this.workers = workers;
	}
	
	public void startOperate() {
		for(Worker worker:workers) {
			worker.goToOffice();
		}
	}
	
	public void operating() {
		for(Worker worker:workers) {
			worker.doWork();
		}
	}
}
