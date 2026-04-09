package Shop;

import java.util.Objects;

public abstract class Product {
	
	private String code;
	private String description;
	private int units;
	private float basePricepreuBase;
	
	public Product(String code, String description, int units, float basePricepreuBase) {
		super();
		this.code = code;
		this.description = description;
		this.units = units;
		this.basePricepreuBase = basePricepreuBase;
	}
	
	public abstract float price();

	public String getCode() {
		return code;
	}
	public String getDescription() {
		return description;
	}
	public int getUnits() {
		return units;
	}
	public float getBasePricepreuBase() {
		return basePricepreuBase;
	}
	
	@Override
	public int hashCode() {
		return 1;
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
	    if (this.code == null) {
	        if (other.code != null)
	            return false;
	    } else {
	        if (!this.code.endsWith(other.code))
	            return false;
	    }
		return true;
	}
	
	@Override
	public String toString() {
	    return code + "\t" + description + "\t" + units;
	}

}
