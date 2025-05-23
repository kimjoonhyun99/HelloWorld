package com.yedam.api;

public class StringUtil {
	
	public static String getGender(String ssn) {
		String backNum = ssn.substring(ssn.length() - 7, ssn.length());
		if (backNum.charAt(0) == '1' || backNum.charAt(0) == '3') {
			return "남성";
		}
		return "여성";
	}
	
	public static String getExtName(String type) {
		int Type = type.length()-type.indexOf(".");
		String Ext = type.substring(type.length() - Type + 1, type.length());
		return Ext;
	}
}