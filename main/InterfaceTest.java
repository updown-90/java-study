public interface InterfaceTest {
	void howl();

	default void move() {
		System.out.println("어슬렁 어슬렁");
	}
}

class InterfaceDog implements InterfaceTest {
	public void howl() {
		System.out.println("멍멍");
	}

	public void move() {
		System.out.println("팔짝 팔짝");
	}
}

class InterfaceCat implements InterfaceTest {
	public void howl() {
		System.out.println("냐옹");
	}
}

class InterfaceMain {
	public static void main(String[] args) {
		InterfaceDog happy = new InterfaceDog();
		InterfaceCat julia = new InterfaceCat();
		happy.move(); // 오버라이드된 멤버함수 호출
		happy.howl(); // 구현된 멤버함수 호출
		julia.move(); // 일반 멤버함수 호출
		julia.howl(); // 구현된 멤버함수 호출
	}
}
