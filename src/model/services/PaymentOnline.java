package model.services;

public class PaymentOnline implements ServicePayment {
	@Override
	public double calcTaxInstallment(double amountInstallment, int installment) {
		double simpleMonth = amountInstallment*0.01*installment+amountInstallment;
		double paymentFee = simpleMonth*0.02+simpleMonth;
		return paymentFee;
	}
}
