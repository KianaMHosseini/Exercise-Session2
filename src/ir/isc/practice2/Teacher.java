package ir.isc.practice2;

public class Teacher extends Person {

	public Teacher(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void notifying() {
		// TODO Auto-generated method stub
		System.out.println("notify dear teacher " + this.getName()+ " by call");
	}
	
	@Override
	public void awake() {
		System.out.println("you have to wake up " + this.getName());
	}

}