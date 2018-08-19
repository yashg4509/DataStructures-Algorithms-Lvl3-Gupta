package _03_01_Animal_Farm;

public class Spider extends Animal{

	@Override
	void makeNoise() {
		System.out.println("eh");
	}

	@Override
	void eat(String food) {
		System.out.println("The spider is eating " + food);
	}

}
