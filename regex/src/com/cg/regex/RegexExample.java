package com.cg.regex;

import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {
		System.out.println(Pattern.matches(".s","as"));
		System.out.println(Pattern.matches(".s","de"));
		System.out.println(Pattern.matches(".s","has"));
		System.out.println(Pattern.matches(".s","hss"));
		System.out.println(Pattern.matches("...s","quls"));
	}
	

}
