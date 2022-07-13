package mod007;

public class AnimalTest {
	public static void main(String[] args) {
//		Animal animal = new Animal();//추상 메소드라서 오류가 뜬다
		Animal animal = new Dog();
		animal.makeSound();
	}
}
