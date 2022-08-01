package com.cg.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClass {

	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("eve");
		Matcher m = pattern.matcher("steve");
		while (m.find())
			System.out.println("pattern found from "+m.start() +"to" +(m.end()-1));
	}

}
