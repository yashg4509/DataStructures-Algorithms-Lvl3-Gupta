package _03_02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double x = population*growthRate;
		x += population/2;
		return x;
	}

}