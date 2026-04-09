package pointofSale;

import java.util.HashSet;
import java.util.Objects;

public class Sale {

	private int code;
	private String datetime;
	private HashSet<SaleLine> saleLines;
	
	public Sale() {
		this.code = 20;
		this.datetime = "03/20/2026";
		this.saleLines = new HashSet<SaleLine>();
	}
	
	public Sale(int code, String datetime) {
        this.code = code;
        this.datetime = datetime;
        this.saleLines = new HashSet<SaleLine>();
    }
	
	public boolean add(SaleLine sl) {
        return this.saleLines.add(sl);
    }

    public boolean remove(SaleLine sl) {
        return this.saleLines.remove(sl);
    }

    public double totalAmount() {
    	double total = 0;
	    for (SaleLine sl : saleLines) {
	        total += sl.getNup() * sl.getProduct().getPrice();
	    }
	    return total;
    }

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sale other = (Sale) obj;
		return code == other.code;
	}
}