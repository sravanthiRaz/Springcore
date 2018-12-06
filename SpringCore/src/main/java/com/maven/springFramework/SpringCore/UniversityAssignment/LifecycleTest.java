package com.maven.springFramework.SpringCore.UniversityAssignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleTest {

	public static void main(String[] args) {
		AbstractApplicationContext ct = new ClassPathXmlApplicationContext(
				"com/maven/springFramework/SpringCore/UniversityAssignment/Lifecycleconfig.xml");
		University un = (University) ct.getBean("university");
		System.out.println(un.getId());
		System.out.println(un.getName());
		System.out.println(un.getLocation());
		System.out.println(un.hashCode());
		
		
		University un1 = (University) ct.getBean("university");
		System.out.println(un1.getId());
		System.out.println(un1.getName());
		System.out.println(un1.getLocation());
		System.out.println(un1.hashCode());
	}

}
