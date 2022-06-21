package predicate.entities;

public class Product implements Comparable<Product>{

		protected String name;
		protected Double price;
		
		public Product() {}
		
		public Product(String name, double price) {
			this.name = name;
			this.price = price;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		public String priceTag() {
			return name + " $ ," + String.format("%.2f", price);
		}
		
		public static boolean staticProductPredicate(Product p) {
			return p.getPrice() >= 100.00;
		}
		
		public boolean nonStaticProductPredicate() {
			return price >= 100.00;
		}

		@Override
		public int compareTo(Product o) {
			return price.compareTo(o.getPrice());
		}
	}
