package _03_02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		double x = population*growthRate*growthRate*.5;
		return x;
	}
	
}