package com.epam.task10_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class StringsCharA {

	public static void main(String[] args) {
		String[] arr={"apple","APT","ana","ant","job","abc","epam","mine","main"};
		List<String> s = Arrays.asList(arr);
		List<String> str_with_a3 = filter(s,(String str)-> (str.startsWith("a"))&&(str.length()==3));
		System.out.println(str_with_a3);
	
	}

	private static List<String> filter(List<String> s, Predicate<String> predicate) {
       List<String> final_str =  new ArrayList<>();
       for(String str : s){
    	   if(predicate.test(str)){
    		   final_str.add(str);
    	   }
       }
		return final_str;
	}
}