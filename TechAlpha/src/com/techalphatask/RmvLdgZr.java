package com.techalphatask;

public class RmvLdgZr {

	public static void main(String[] args) {
		String str="00000123789";
		String anString="";


		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='0') {
				continue;
			}
			else {
				anString = str.substring(i);
				break;
			}
		}
		System.out.println(anString);

	}

}
