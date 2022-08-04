package com.cg.exceptionHandling;

public class CatchFinal {

	public static void main(String[] args) {
		try {
		
			String name=null;
			System.out.println(name.length());
		}
		
	finally(Exception e)
	{
System.out.println("this statment is executed anyway");
	}
}
}