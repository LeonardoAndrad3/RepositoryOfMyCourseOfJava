package services;

public class BrazilInterestService implements InterestService {

	private Double interesRent;
	
	public BrazilInterestService(Double interesRent) {
		this.interesRent = interesRent;
	}

	@Override
	public double getInterestRent() {
		return interesRent;
	}

}
