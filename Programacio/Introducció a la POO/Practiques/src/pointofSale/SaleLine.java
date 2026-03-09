package pointofSale;

import java.util.Objects;

public class SaleLine {
	private int nup;
	Product product;
	
	public SaleLine() {
		this.nup = 5;
		this.product = new Product();
	}
	
	public SaleLine(int nup,Product product) {
		this.nup = nup;
		this.product = product;
	}
	
	@Override
	public int hashCode() {
	    return Objects.hash(product);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SaleLine other = (SaleLine) obj;
		return product.equals(other.product);
	}
	
	public void setProducte(Product product) {
		this.product = product;
	}
	
	public void setNup(int nup) {
		this.nup = nup;
	}

	public int getNup() {
		return nup;
	}

	public Product getProduct() {
		return product;
	}
	
}
