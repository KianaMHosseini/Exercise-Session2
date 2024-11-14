package ir.isc.practice2;

public class Student extends Person {

	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void notifying() {
		// TODO Auto-generated method stub
		System.out.println("notify dear student " + this.getName()+ " by SMS");
	}
	
	@Override
	public void awake() {
		System.out.println("you have to wake up " + this.getName());
	}

}
