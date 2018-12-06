package com.maven.springFramework.SpringCore.Constructorinjection.Ambiguity;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleTest {

	public static void main(String[] args) {
		AbstractApplicationContext ct = new ClassPathXmlApplicationContext(
				"com/maven/springFramework/SpringCore/Constructorinjection/Ambiguity/Lifecycleconfig.xml");
		Addtions add = (Addtions) ct.getBean("addtions");
		System.out.println(add);
	}
}
