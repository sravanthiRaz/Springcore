package com.maven.springFramework.SpringCore.lc.assignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleTest {

	public static void main(String[] args) {
		AbstractApplicationContext ct = new ClassPathXmlApplicationContext(
				"com/maven/springFramework/SpringCore/lc/assignment/Lifecycleconfig.xml");
		TicketReservation pt = (TicketReservation) ct.getBean("TicketReservation");
		System.out.println(pt.getId());
		ct.registerShutdownHook();

	}

}
