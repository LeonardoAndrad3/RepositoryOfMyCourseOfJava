package services;

import java.security.InvalidParameterException;

public interface InterestService {

	double getInterestRent();
	
	default double payment(Double amount, Integer months) {
		if(months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRent()/100, months);
	}
	
}
