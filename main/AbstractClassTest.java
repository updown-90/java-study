public abstract class AbstractClassTest {
	public String sName;

	public void move() {
		System.out.println("어슬렁 어슬렁");
	}

	abstract void howl();
}

class Dog extends AbstractClassTest {
	public void move() {
		System.out.println("팔짝 팔짝");
	}

	void howl() {
		System.out.println("멍멍");
	}
}

class Cat extends AbstractClassTest {
	void howl() {
		System.out.println("냐옹");
	}
}

class Main {
	public static void main(String[] args) {
		Dog happy = new Dog();
		Cat julia = new Cat();
		happy.move(); // 오버라이드된 멤버함수 호출
		happy.howl(); // 구현된 멤버함수 호출
		julia.move(); // 일반 멤버함수 호출
		julia.howl(); // 구현된 멤버함수 호출
	}
}
