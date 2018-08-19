package _03_01_Animal_Farm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<>();
		Spider c = new Spider();
		Cow s = new Cow();
		Chicken b = new Chicken();
		Pig p = new Pig();
		
		farm.add(c);
		farm.add(s);
		farm.add(b);
		farm.add(p);
		
		for (int i = 0; i < farm.size(); i++) {
			farm.get(i).makeNoise();
			farm.get(i).eat("spider eye");
		}
	}
}
