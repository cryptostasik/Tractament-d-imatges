package contacts;

import java.util.HashSet;
import java.util.Objects;

public class Contact {

	private int dni;
	private String name;
	private String phone;
	private HashSet<Contact> contacts;
	
	public Contact() {
		this.dni = 12345678;
		this.name = "Ser mini";
		this.phone = "34066123";
		this.contacts = new HashSet<Contact>();
	}
	
	public Contact(int dni) {
		this.dni = dni;
		this.contacts = new HashSet<Contact>();
	}
	public Contact(int dni,String name,String phone) {
		this.dni = dni;
		this.name = name.trim();
		this.phone = phone;
		this.contacts = new HashSet<Contact>();
	}
	
	public Contact search(int dni) {
		Contact fakeContact = new Contact(dni);
		for (Contact c : contacts) {
			if (c.equals(fakeContact)) return c;
	    }
		/*
		for (Contact c : contacts) {
			if (c.getDni() == this.dni) return c;
	    }
	    */
		return null;
	}
	public boolean add(Contact contact) {
		if (contact.equals(this)) {
            return false;
        }
        return this.contacts.add(contact);
	}
	public boolean remove() {	
		return this.contacts.remove(contacts);
	}
	
	public void removeAll() {
		this.contacts.clear();
	}
	
	public void listContacts() {
		System.out.println("Contactes de " + name + " (" + dni + "):");
        for (Contact c : contacts) {
            System.out.printf("  • DNI: %d   Nom: %-20s   Tel: %s%n",
                    c.getDni(), c.getName(), c.getPhone());
        }
	}	
	
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if(this.dni == other.dni) return true;
		else return false;
	}

	public int getDni() {
		return dni;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}
}
