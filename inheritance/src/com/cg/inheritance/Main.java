package com.cg.inheritance;

public class Main {

	public static void main(String[] args) {
		Mobile mobileObj = new Mobile("windows","windows","recent");
		System.out.println(mobileObj);
		
		Android andObj = new Android("android","android","2000");
		System.out.println(andObj);
		Blackberry blackObj = new Blackberry("blackberry","blackberry","key1");
		System.out.println(blackObj);
	}

}
