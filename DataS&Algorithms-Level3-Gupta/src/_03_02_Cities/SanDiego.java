package _03_02_Cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double x = population*growthRate;
		x += 1000000;
		return x;
	}
}