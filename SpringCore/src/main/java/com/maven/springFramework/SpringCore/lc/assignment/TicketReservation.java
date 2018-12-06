package com.maven.springFramework.SpringCore.lc.assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@PostConstruct
	public void initialize(){
		System.out.println("inside init method");
	}
	@PreDestroy
public void cleanup(){
	System.out.println("After destory");
}
	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	
	

}
