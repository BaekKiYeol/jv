package mod007;

/*
 * -, abstract메소드의 집합, 상수(public)
 * -, 인스턴스 생성 불가
 * -, 다중 상속 지원
 * @author Administrator
 */
public interface Flyer {
	public void fly(); //앞에 abstract 생략
	public void takeoff();
	public void land();
}
