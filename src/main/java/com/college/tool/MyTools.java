package com.college.tool;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyTools {
	public static void main(String[] args) {
		System.out.println(MyTools.isEnglishString("zhon00____ "));
	}
	
	
//如果字符串只包含字母数字下划线返回true否则返回false
public static boolean isEnglishString(String string) {
	if (string == null) {
		return false;
	}else {
		Pattern pattern = Pattern.compile("[^\\w]");
		Matcher matcher = pattern.matcher(string);
		if (matcher.find()) {
			return false;
		}else {
			return true;
		}
	}
	
	
	
}
}
