package ir.isc.practice2;

public abstract class Person {
	private String name;
	private int age;
	
	public abstract void notifying();
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void awake() {
		System.out.println("you have to wake up");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
