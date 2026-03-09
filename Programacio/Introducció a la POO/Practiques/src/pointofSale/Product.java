package pointofSale;

import java.util.Objects;

public class Product {
	private int ean;
	private String description;
	private String brand;
	private double price;
	
	public Product() {
		this.ean = 11;
		this.description = "description";
		this.brand = "Pepsi";
		this.price = 10.0;
	}
	
	public Product(int ean) {
		this.ean = ean;
	}
	
	public Product(int ean,String description,String brand, double price) {
		this.ean = ean;
		this.description = description;
		this.brand = brand;
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ean);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if(this.ean == other.getEan()) return true;
		else return false;
	}

	public double getPrice() {
		return price;
	}

	public int getEan() {
		return ean;
	}
}
