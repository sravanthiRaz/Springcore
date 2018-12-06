package com.maven.springFramework.SpringCore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setTest {

	public static void main(String[] args) {
		ApplicationContext ct = new ClassPathXmlApplicationContext("com/maven/springFramework/SpringCore/set/Setconfig.xml");
carDealer cd =(carDealer)ct.getBean("cardealer");
System.out.println(cd.getName());
System.out.println(cd.getModels());
	}

}
