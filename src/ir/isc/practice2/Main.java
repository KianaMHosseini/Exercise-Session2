package ir.isc.practice2;

public class Main {

	public static void main(String[] args) {
		Teacher teacher = new Teacher("Ali Rasouli", 47);
		Student student = new Student("Sara Ahmadi", 22);
		Manager manager = new Manager("Amir Mohammadi", 56);
		
		teacher.notifying();
		student.notifying();
		manager.notifying();
		
		System.out.println("**********************");
		
		teacher.awake();
		student.awake();
		manager.awake();
		

	}

}
