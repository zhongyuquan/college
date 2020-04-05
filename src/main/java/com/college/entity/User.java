package com.college.entity;

public class User {
	
private String id;
private String pwd;


public void setPwd(String pwd) {
	this.pwd = pwd;
}




public String getId() {
	return id;
}




public void setId(String id) {
	this.id = id;
}




public String getPwd() {
	return pwd;
}




@Override
public String toString() {
	return "User [id=" + id + ", pwd=" + pwd + "]";
}

}
