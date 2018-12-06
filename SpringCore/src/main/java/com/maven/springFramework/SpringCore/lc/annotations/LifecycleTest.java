package com.maven.springFramework.SpringCore.lc.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleTest {

	public static void main(String[] args) {
		AbstractApplicationContext ct = new ClassPathXmlApplicationContext(
				"com/maven/springFramework/SpringCore/lc/annotations/Lifecycleconfig.xml");
		Patient pt = (Patient) ct.getBean("patient");
		System.out.println(pt.getId());
		ct.registerShutdownHook();

	}

}
