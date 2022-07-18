package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product{

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufactureDate;

	public UsedProduct() {super();}

	public UsedProduct(String name, double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	@Override
	public final String priceTag() {

		return name + " (used) $ "+ String.format("%.2f", price) +"(Manufacture date: "+ sdf.format(manufactureDate)+")";
	}


}
