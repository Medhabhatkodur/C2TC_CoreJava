package com.cg.regex;

import java.util.regex.Pattern;

public class RegexCharClass {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[aby]","aaby"));
		System.out.println(Pattern.matches("[aby]","by"));
		System.out.println(Pattern.matches("[aby]","aby"));
		System.out.println(Pattern.matches("[aby]","y"));
		System.out.println(Pattern.matches("[aby]"," "));
		System.out.println(Pattern.matches("[^aby]","h"));
		System.out.println(Pattern.matches("[a-hG-M]","a"));
		System.out.println(Pattern.matches("[a-hG-M]","H"));
		System.out.println(Pattern.matches("[a-hG-M]","N"));
		System.out.println(Pattern.matches("[a-h&&[aby]]","a"));
		System.out.println(Pattern.matches("[a-h&&[aby]]","h"));
		System.out.println(Pattern.matches("[a-h&&[^aby]]","a"));
		System.out.println(Pattern.matches("[a-h&&[^ab]]","c"));
		System.out.println(Pattern.matches("[a-h&&[^m-v]]","a"));
		System.out.println(Pattern.matches("[a-h&&[^m-v]]","n"));
	}

}
