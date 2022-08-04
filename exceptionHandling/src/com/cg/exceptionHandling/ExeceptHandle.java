package com.cg.exceptionHandling;

public class ExeceptHandle {

	public static void main(String[] args) {
		try
		{
			
			int a=0;
			int b=10/a;
			String name=null;
			System.out.println(name.length());
		}
		catch(ArithmeticException e) {
			System.out.println("airthmetic exception");
		}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("array index out of bound exeption");
			}
				catch(Exception e) {
					System.out.println("parent exception");
				}
				System.out.println("rest of code");
			
		
	}

}
