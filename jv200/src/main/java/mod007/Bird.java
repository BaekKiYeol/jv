package mod007;

public class Bird implements Flyer{
	public void fly() {
		System.out.println("새 : 날기");
	}

	public void takeoff() {
		System.out.println("새 : 이륙");
	}

	public void land() {
		System.out.println("새 : 착륙");
	}
}
