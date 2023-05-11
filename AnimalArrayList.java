package kita8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnimalArrayList {

	public static void main(String[] args) {
		List<Animal> animalList= new ArrayList();
		Dog dog;
		Cat cat;
		for(int i=0;i<6;i++) {
			Random rand=new Random();	//乱数を使用してランダムで猫か犬が入る。
			int num=rand.nextInt(10);
			if(num%2==0) {
				animalList.add(new Cat());
			}else {
				animalList.add(new Dog());
			}
		}
		
		System.out.println(animalList);
		
		System.out.println();
		for(Animal ani:animalList) {
			ani.Speak();
		}
	}

}
