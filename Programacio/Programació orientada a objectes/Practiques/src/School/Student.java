package School;

public class Student extends Person {
	private String cycle;
	private int course;
	
	public Student() {
		super();
		System.out.print("Soc el constructor de la classe Student\n");
	}

	public String getCycle() {
		return cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}
	
}
