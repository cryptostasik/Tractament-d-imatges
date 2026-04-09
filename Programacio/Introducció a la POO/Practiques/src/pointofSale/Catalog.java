package pointofSale;

import java.util.HashSet;
import java.util.Objects;

public class Catalog {
	private String name;
	private HashSet<Product> products;
	
	public Catalog() {
		this.name = "Zero";
		this.products = new HashSet<Product>();
	}
	
	public Catalog(String name) {
		this.name = name.trim();
		this.products = new HashSet<Product>();
	}
	
	public boolean add(Product product) {
		return this.products.add(product);
	}
	
	public boolean remove(Product product) {
		return this.products.remove(product);
	}
	
	public Product search (int ean) {
		/*
		Product fakeProduct = new Product(ean);
		if (this.products.contains(fakeProduct)) return fakeProduct;
		return null;
		*/
		Product fakeProduct = new Product(ean);
		for (Product p : this.products) {
			if (p.equals(fakeProduct)) return p;
		}
		return null;
	}
	
	public int productsNumber() {
		return this.products.size();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Catalog other = (Catalog) obj;
		return this.name.equals(other.name);
	}

	public String getName() {
		return name;
	}
}
