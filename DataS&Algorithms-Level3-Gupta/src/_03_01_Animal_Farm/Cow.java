package _03_01_Animal_Farm;

public class Cow extends Animal{

	@Override
	void makeNoise() {
		System.out.println("moo");
	}

	@Override
	void eat(String food) {
		System.out.println("The cow is eating " + food);
	}

}
