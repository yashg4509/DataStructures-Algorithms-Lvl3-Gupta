package _03_01_Animal_Farm;

public class Chicken extends Animal{

	@Override
	void makeNoise() {
		System.out.println("cucaw");
	}

	@Override
	void eat(String food) {
		System.out.println("The chicken is eating " + food);
		
	}

}
