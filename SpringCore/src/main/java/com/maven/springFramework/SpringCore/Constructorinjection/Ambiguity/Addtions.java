package com.maven.springFramework.SpringCore.Constructorinjection.Ambiguity;

public class Addtions {
	Addtions(int a, int b){
		System.out.println("inside the constructor INT");
	}
	Addtions(Double a,Double b){
		System.out.println("inside the constructor Double");
	}
	Addtions(String a,String b){
		System.out.println("inside the constructor String");
	}
}
