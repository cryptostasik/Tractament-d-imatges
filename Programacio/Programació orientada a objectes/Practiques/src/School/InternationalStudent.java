package School;

public class InternationalStudent extends Student {
	private String country;
	
	public InternationalStudent() {
		super();
		System.out.print("Soc el constructor de la classe InternationalStudent\n");
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}