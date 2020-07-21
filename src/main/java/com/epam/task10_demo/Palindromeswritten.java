package com.epam.task10_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Palindromeswritten {
	public static void main(String[] args){
		String[] strings ={"nitin","epam","banana","aba","maam","lebel"};
		List<String> strarr = Arrays.asList(strings);
		List<String> Palindromes = Palindromeswritten.filterList(strarr,Palindromefunc::isPalindrome);
		System.out.println(Palindromes);
	}

	public static List<String> filterList(List<String> strarr,Predicate<String> predicate) {
		List<String> finalPalindrome = new ArrayList<String>();
		for(String str : strarr){
			if(predicate.test(str)){
				finalPalindrome.add(str);
			}
		}
		return finalPalindrome;
	}
	
}