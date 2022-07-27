package com.cg.abstractMovie;
abstract class Movie{
	abstract String setTitle();
}
class Mymovie extends Movie
{

	@Override
	String setTitle() {
		System.out.println("the title is:Harry potter" );
		return null;
	}
	
}
public class Main {

	public static void main(String[] args) {
		Mymovie m=new Mymovie();
		m.setTitle();

	}

}
