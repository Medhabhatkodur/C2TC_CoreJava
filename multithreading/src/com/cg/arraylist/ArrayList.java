package com.cg.arraylist;

import java.util.List;
import java.util.Arrays;

public class ArrayList {
//static String[] seasonList=new String[] {"winter","summer","spring","rainy"};
	public static void main(String[] args) {
		List<String> seasonList=Arrays.asList(new String[] {"winter","summer","spring","rainy"});
		
		for(String value:seasonList) {
			try {
				Thread.sleep(3000);//sleep for 3 seconds
			}catch(InterruptedException exp) {
				System.out.println(exp.getMessage());
		
			}
			System.out.println(value);
		}

	}

}
