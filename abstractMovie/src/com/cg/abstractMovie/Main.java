package com.cg.abstractMovie;
abstract class Movie{
	String title;
	abstract void setTitle(String name);
}
class Mymovie extends Movie
{

	@Override
	void setTitle(String name) {
		
		title=name;
	}
	String getTitle() {
		return title;
		
	}
}
public class Main {

	public static void main(String[] args) {
		String title="harry potter";
		Mymovie m=new Mymovie();
		m.setTitle(title);
		m.getTitle();
		System.out.println("the title is:"+m.getTitle() );
	}

}
