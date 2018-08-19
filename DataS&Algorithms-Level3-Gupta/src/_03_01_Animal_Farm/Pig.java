package _03_01_Animal_Farm;

public class Pig extends Animal{

	@Override
	void makeNoise() {
		System.out.println("oink");
	}

	@Override
	void eat(String food) {
		System.out.println("The pig is eating " + food);
	}

}
