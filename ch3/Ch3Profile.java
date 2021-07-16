public class Ch3Profile {
	String name = "OOO";
	int age = 0;

	public static void main(String[] args) {
		Ch3Profile ch3Profile = new Ch3Profile();
		ch3Profile.setName("Min");
		ch3Profile.setAge(20);
		ch3Profile.printName();
		ch3Profile.printAge();
	}

	public void setName(String str) {
		name = str;
	}

	public void setAge(int value) {
		age = value;
	}

	public void printName() {
		System.out.println("My name is " + name);
	}

	public void printAge() {
		System.out.println("My age is " + age);

	}
}
