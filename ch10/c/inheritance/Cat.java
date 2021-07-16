package c.inheritance;

public class Cat extends Animal {
	@Override
	public void move() {
		super.move();
	}

	@Override
	public void eat() {
		super.eat();
	}

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.move();
	}
}
