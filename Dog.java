package kita8;

public class Dog extends Animal{
	public void Run() {
		System.out.println("トコトコ");
	}
	@Override
	public String Speak() {
		//System.out.println("ワンワン");
		return "ワンワン";
	}
}
