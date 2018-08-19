package _03_02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double annTax = population * growthRate;
		annTax += population/2;
		return annTax;
	}

}
