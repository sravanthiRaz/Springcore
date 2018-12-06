package com.maven.springFramework.SpringCore.dbpropertyAssignment;

public class MyDAO {
private String url;
MyDAO(String url){
	this.url=url;
	
}
@Override
public String toString() {
	return "MyDAO [url=" + url + "]";
}


}
