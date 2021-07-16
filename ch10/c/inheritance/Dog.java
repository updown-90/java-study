package c.inheritance;

public class Dog extends Animal {
	@Override
	public void move() {
		super.move();
	}

	@Override
	public void eat() {
		super.eat();
	}

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.move();
	}
}
