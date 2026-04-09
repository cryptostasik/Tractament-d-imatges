package School;

public class Person {
	private String name;
	private String address;
	
	public Person() {
		this.name = "a";
		this.address = "b";
		System.out.print("Soc el constructor de la classe Person\n");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
