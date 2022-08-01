package com.cg.regex;

import java.util.regex.Pattern;

public class RegexQuantifiers {

	public static void main(String[] args) {
		System.out.println("?quantifiers");
		System.out.println(Pattern.matches("[stp]?","s"));
		System.out.println(Pattern.matches("[stp]?","S"));
		System.out.println(Pattern.matches("[stp]?","sstp"));
		System.out.println(Pattern.matches("[stp]?","st"));
		System.out.println(Pattern.matches("[stp]?","stp"));
		System.out.println(Pattern.matches("[stp]+","s"));
		System.out.println(Pattern.matches("[stp]+","ssst"));
		System.out.println(Pattern.matches("[stp]+","ttty"));
		System.out.println(Pattern.matches("[stp]+","ssttpp"));
		System.out.println(Pattern.matches("[stp]+","ert"));
		System.out.println(Pattern.matches("[stp]*","s"));
		System.out.println(Pattern.matches("[stp]*","ssst"));
		System.out.println(Pattern.matches("[stp]*",""));
		System.out.println(Pattern.matches("[stp]{2}","s"));
		System.out.println(Pattern.matches("[stp]{2}","ss"));
		System.out.println(Pattern.matches("[stp]{2}","sst"));
		System.out.println(Pattern.matches("[stp]{2,}","ssttt"));
		System.out.println(Pattern.matches("[stp]{2,5}","ss"));
		System.out.println(Pattern.matches("[stp]{2,5}","ssstt"));
	}
	

}
