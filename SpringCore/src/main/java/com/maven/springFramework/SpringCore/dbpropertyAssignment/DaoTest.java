package com.maven.springFramework.SpringCore.dbpropertyAssignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {

	public static void main(String[] args) {
		ApplicationContext ct= new ClassPathXmlApplicationContext("com/maven/springFramework/SpringCore/dbpropertyAssignment/MyDAOConfig.xml");
	MyDAO dao=(MyDAO)ct.getBean("myDAO");
	System.out.println(dao);}

}
