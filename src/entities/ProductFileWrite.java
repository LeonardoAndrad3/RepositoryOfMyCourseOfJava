package entities;

public class ProductFileWrite {

	private String name;
	private Double price;
	private Integer quantity;

	public ProductFileWrite(String[] arr) {
		this.name = arr[0];
		this.price = Double.parseDouble(arr[1]);
		this.quantity = Integer.parseInt(arr[2]);
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "Product: "+name +", "+ String.format("%.2f", price*quantity);
	}


}
