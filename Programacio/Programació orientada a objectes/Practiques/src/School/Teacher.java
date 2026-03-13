package School;

import java.util.HashSet;
import java.util.Objects;

public class Teacher extends Person {
	HashSet<String> subjects;
	
	public Teacher() {
		super();
		System.out.print("Soc el constructor de la classe Teacher\n");
	}
	public boolean addSubject() {
		return subjects.add(getAddress());
	}
	public boolean removeSunject() {
		return subjects.remove(subjects);
	}
	@Override
	public int hashCode() {
		return Objects.hash(subjects);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return Objects.equals(subjects, other.subjects);
	}
}
