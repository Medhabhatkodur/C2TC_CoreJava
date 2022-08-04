package com.cg.multithreading;

class ApplicationException extends Exception{
	private int detail;
	
	

	public ApplicationException(int args) {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "ApplicationException [detail=" + detail + "]";
	}
	
}

public class UserException {
	
	static void compute(int a) throws ApplicationException{
		System.out.println("about to commute ("+a+")");
		if(a>10) {
			throw new ApplicationException(a);
		}
		System.out.println("normal exit");
	}
	public static void main(String[] args) {
		try {
			compute(1);
			compute(20);
		}catch(ApplicationException e) {
			System.out.println("exception caught" +e);
		}
	}
}