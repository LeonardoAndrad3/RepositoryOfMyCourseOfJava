package entities;

public final class ImportedProduct extends Product{

	private Double customsFee;

	public ImportedProduct() {super();}

	public ImportedProduct(String name, double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}



	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	public final double totalPrice() {
		return price + getCustomsFee();
	}

	@Override
	public final String priceTag() {
		return name + " $ "+ String.format("%.2f", totalPrice()) + "(Customs fee: $ "+String.format("%.2f", getCustomsFee())+")";
	}
}
