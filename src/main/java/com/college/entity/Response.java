package com.college.entity;

public class Response {

boolean result = false;	
String message = "无消息!";
int total = 0;
int pageSize = 0;
int pageIndex = 1;
Object data = null;
public boolean isResult() {
	return result;
}
public void setResult(boolean result) {
	this.result = result;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
public int getPageSize() {
	return pageSize;
}
public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
}
public int getPageIndex() {
	return pageIndex;
}
public void setPageIndex(int pageIndex) {
	this.pageIndex = pageIndex;
}
public Object getData() {
	return data;
}
public void setData(Object data) {
	this.data = data;
}

@Override
public String toString() {
	return "Response [result=" + result + ", message=" + message + ", total=" + total + ", pageSize=" + pageSize
			+ ", pageIndex=" + pageIndex + ", data=" + data + "]";
}



}
