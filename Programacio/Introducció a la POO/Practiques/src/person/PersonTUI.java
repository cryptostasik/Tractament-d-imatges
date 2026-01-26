package person;

public class PersonTUI {

	public static void main(String[] args) {
		Person p1 = new Person("Eli", 27, 1.60, 'W', false);
		Person p2 = new Person("Alex", 20, 1.70, 'M', false);
		Person p3 = new Person("Pare");
		Person p4 = new Person();
		System.out.println("Alcada = " + p1.getHeight());
		p1.setHeight(1.80);
		p1.bitrthday();
		System.out.println(p1.toString());
		p2.bitrthday();
		Person girl = p1;
		Person boy = p2;
		System.out.println(boy.toString());
		System.out.println(girl.toString());
		System.out.println(p4);
	}

}
