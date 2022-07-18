package services;

public class UsaInterestService implements InterestService {

	private Double interesRent;

	public UsaInterestService(Double interesRent) {
		this.interesRent = interesRent;
	}

	@Override
	public double getInterestRent() {
		return interesRent;
	}

}
