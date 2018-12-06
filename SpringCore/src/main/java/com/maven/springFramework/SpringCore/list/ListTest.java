package com.maven.springFramework.SpringCore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListTest {

	public static void main(String[] args) {
		ApplicationContext ct = new ClassPathXmlApplicationContext("com/maven/springFramework/SpringCore/list/Listconfig.xml");
Hospital hp = (Hospital)ct.getBean("hospital");
System.out.println(hp.getName());
System.out.println(hp.getDeparments());
	}

}
