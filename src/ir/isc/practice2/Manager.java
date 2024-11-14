package ir.isc.practice2;

public class Manager extends Person {

	public Manager(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void notifying() {
		// TODO Auto-generated method stub
		System.out.println("notify dear manager " + this.getName()+ " in person");
	}

	@Override
	public void awake() {
		System.out.println("you have to wake up " + this.getName());
	}
}
 