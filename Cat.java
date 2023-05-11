package kita8;

public class Cat extends Animal{
	public void Sleep() {
		System.out.println("スースー");
	}
	
	@Override
	public String Speak() {
		//System.out.println("ニャーニャー");
		return "ニャーニャー";
	}
}
