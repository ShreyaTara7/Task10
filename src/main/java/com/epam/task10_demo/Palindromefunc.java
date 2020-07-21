package com.epam.task10_demo;


public class Palindromefunc {
	public static boolean isPalindrome(String strarr){
		int i=0,j=strarr.length()-1;
		while(i<j){
			if(strarr.charAt(i)!=strarr.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
