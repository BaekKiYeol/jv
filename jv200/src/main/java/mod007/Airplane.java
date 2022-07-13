package mod007;

public class Airplane implements Flyer, vehicle{

	public void fly() {
		System.out.println("비행기 : 날기");
	}


	public void takeoff() {
		System.out.println("비행기 : 이륙");
	}


	public void land() {
		System.out.println("비행기 : 착륙");
	}
	
}
